package rune;

import rune_filter.FilterFunctions;

public class EfficiencyCalculator {
	
	//substat max rolls
	float PercentMax = 40f;
	float CritRateMax = 30f;
	float CritDmgMax = 35f;
	float SpdMax = 30f;
	float FlatHPMax = 1875f;
	float FlatAtkDefMax = 100f;
	
	//primary stat maxes 6* runes
	float primaryPercent = 63f;
	float primaryAtkDef = 160f;
	float primaryHP = 2448f;
	float primarySpd = 42f;
	float primaryCD = 80f;
	float primaryCR = 58f;
	float primaryResAcc = 64f;
	
	//stat multipliers
	float m_percent = 0.810f;
	float m_atkdef = 0.844f;
	float m_hp = 0.853f;
	float m_spd = 0.929f;
	float m_cd = 0.813f;
	float m_cr = 0.810f;
	float m_resacc = 0.797f;
	
	//implicit prefix maxes
	float implicitMaxPercent = 8f;
	float implicitMaxAtk = 16f;
	float implicitMaxDef = 17f;
	float implicitMaxHP = 355f;
	float implcitMaxSpeed = 6f;
	float impliciMaxCR = 6f;
	float implicitMaxCD = 7f;
	
	public EfficiencyCalculator () {
	}
	
	public float calcCurrent(Rune r) {
		float eff = 0f;
		float runeGradeMulti = calcMultiplier(r);
		
		float subTotal = 0f;
		for(int i=1;i<r.getStatListSize();i++) {
			subTotal += calculateSub(r.getStat(i));
		}
				
		eff = (subTotal + runeGradeMulti)/(2.8f);
		return eff;
	}
	
	//5* Rune max is a rough estimate based on an average the substats can roll
	//Note that if a rune has atk%, def%, hp% subs it's much closer to 6*
	//compared to a rune with flat atk or hp
	public float calcMax(Rune r) {
		float eff = 0f;
		float runeGradeMulti = calcMultiplier(r);
		
		float subTotal = 0f;
		for(int i=1;i<r.getStatListSize();i++) {
			subTotal += calculateSub(r.getStat(i));
		}
		
		int lvl= r.getLevel();
		int grade = r.getGrade();
		float tmpAdd = 0f;
		if(lvl < 3) {
			tmpAdd += 0.8;
		}else if(lvl > 3 && lvl < 6) {
			tmpAdd += 0.6;
		}else if(lvl > 6 && lvl < 9) {
			tmpAdd += 0.4;
		}else if(lvl > 9 && lvl < 12) {
			tmpAdd += 0.2;
		}
		if(grade == 5) {
			tmpAdd = tmpAdd*0.82f;
		}
		
		eff = ((subTotal + tmpAdd)+runeGradeMulti)/(2.8f);
		
		return eff;
	}
	
	public float calcBarion(Rune r) {
		float eff = 0f;
		
		return eff;
	}
	
	private float calcMultiplier(Rune r) {
		float multi = 0f;
		if(r.getGrade() == 6) {
			multi = 1.0f;
		}else if(r.getGrade() == 5){
			if((r.getStat(0).getType() == StatEnum.ATKFLAT) ||(r.getStat(0).getType() == StatEnum.DEFFLAT) ){
				multi = m_atkdef;
			}else if(r.getStat(0).getType() == StatEnum.HPFLAT) {
				multi = m_hp;
			}else if((r.getStat(0).getType() == StatEnum.HPPERCENT) ||(r.getStat(0).getType() == StatEnum.DEFPERCENT) ||(r.getStat(0).getType() == StatEnum.ATKPERCENT)){
				multi = m_percent;
			}else if(r.getStat(0).getType() == StatEnum.SPD) {
				multi = m_spd;
			}else if(r.getStat(0).getType() == StatEnum.CRITDAMAGE) {
				multi = m_cd;
			}else if(r.getStat(0).getType() == StatEnum.CRITRATE) {
				multi = m_cr;
			}else if(r.getStat(0).getType() == StatEnum.ACCURACY || r.getStat(0).getType() == StatEnum.RESISTANCE ) {
				multi = m_resacc;
			}
			
			return multi;
		}
		
		
		
		return multi;
	}
	
	private float calculateSub(Stat s) {
		
		float answer = 0f;
		float value = s.getValue() + s.getGrindValue();
		if(s.getType() == StatEnum.ATKFLAT || s.getType() == StatEnum.DEFFLAT) {
			answer = value / FlatAtkDefMax;
		}else if(s.getType() == StatEnum.HPFLAT) {
			answer = value / FlatHPMax;
		}else if(s.getType() == StatEnum.SPD) {
			answer = value / SpdMax;
		}else if((s.getType() == StatEnum.ATKPERCENT) || (s.getType() == StatEnum.DEFPERCENT) || (s.getType() == StatEnum.HPPERCENT)) {
			answer = value / PercentMax;
		}else if(s.getType() == StatEnum.CRITDAMAGE) {
			answer = value / CritDmgMax;
		}else if(s.getType() == StatEnum.CRITRATE) {
			answer = value / CritRateMax;
		}else if(s.getType() == StatEnum.ACCURACY || s.getType() == StatEnum.RESISTANCE) {
			answer = value / PercentMax;
		}
		return answer;
	}
	
}
