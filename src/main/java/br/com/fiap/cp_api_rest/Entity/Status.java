package br.com.fiap.cp_api_rest.Entity;

import java.util.Random;

public class Status {
    private Long id;

    //TODO: ADICIONAR MÉTODO DE EVOLUIR
    private int lvl, expPoints;
    //STATUS BASE DO POKEMON

    int hp,attack, spAttack,defense,spDefense,speed,total;
    //STATUS INDIVIDUAIS DO POKEMON (0 a 31)
    private int hpBase,attackBase, spAttackBase,defenseBase,spDefenseBase,speedBase,totalBase;
    private int hpIv,attackIv, spAttackIv,defenseIv,spDefenseIv,speedIv,totalIv;
    //TODO: IMPLEMENTAR SISTEMA DE CALCULO DE EVS
    //STATUS DA EXPERIENCIA DO POKEMON(510 EVs MAXIMOS E 252 maximos por atributo)
    private int hpEv,attackEv, spAttackEv,defenseEv,spDefenseEv,speedEv,totalEv;

    public void generatedIvs(){
        Random random = new Random();

        this.hpIv = random.nextInt(32);
        this.attackIv = random.nextInt(32);
        this.spAttackIv = random.nextInt(32);
        this.defenseIv = random.nextInt(32);
        this.spDefenseIv = random.nextInt(32);
        this.speedIv = random.nextInt(32);
        this.totalIv= attackIv + hpIv + spAttackIv + defenseIv + spDefenseIv + speedIv;

    }
    public void presetEVs() {
        this.hpEv = 0;
        this.attackEv = 0;
        this.defenseEv = 0;
        this.spAttackEv = 0;
        this.spDefenseEv = 0;
        this.speedEv = 0;
    }

    public int calculateHp(){
        return ((2*hpBase+hpIv+(hpEv/4)*lvl)/100)+lvl+10;

    }

    public void calculateAllAttributes(){
        this.hp=calculateHp();
        this.attack= calculateOtherAttributes(attackBase,attackIv,attackEv);
        this.spAttack=calculateOtherAttributes(spAttackBase,spAttackIv,spAttackEv);
        this.defense=calculateOtherAttributes(defenseBase,defenseIv,defenseEv);
        this.spDefense=calculateOtherAttributes(spDefenseBase,spDefenseIv,spDefenseEv);
        this.speed=calculateOtherAttributes(speedBase,speedIv,speedEv);
        this.total= attack + hp + spAttack + defense + spDefense + speed;
    }
    public int calculateOtherAttributes(int base,int Iv,int Ev){
        return ((2*base+Iv+(Ev/4)*lvl)/100)+5;
    }

}
