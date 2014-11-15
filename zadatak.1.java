	/* Pretpostavicemo da se radi o pravilnoj piramidi(baza kvadrat)
	 * s predstavlja stranicu baze piramide
	 * pBp predstavlja povrsinu baze piramide
	 * pTr predstavlja povrsinu jednog od cetiri trokuta kao strana piramide
	 * pP predstavlja povrsinu piramide
	 * vP predstavlja volumen piramide
	 * pS predstavlja povrsinu sfere
	 * vS predstavlja volumen sfere
	 * h predstavlja visinu piramide
	 * r predstavlja poluprecnik sfere
	 */

public class MjereGeometrijskskihTijela {
	public static void main(String[] args) {
		int s,v,h,r, min=1, max=50;
		double pBp,pTr,pP,vP,pS,vS;
		 s=(int) (min+(Math.random()*(max-min+1)));
		 v =(int) (min+(Math.random()*(max-min+1)));
		 h=(int) (min+(Math.random()*(max-min+1)));
		 r=(int) (min+(Math.random()*(max-min+1)));
		 pBp=s*s;
		 pTr=(s*v)/2;
		 pP=pBp+4*pTr;
		 vP=(pBp*h)/3;
		 pS=4*r*r*3.14;
		 vS=(4*r*r*r*3.14)/3;
		 System.out.println("Povrsina piramide je "+pP+"\nZapremina piramide je "+vP+"" +
		 		"\nPovrsina Sfere je "+pS+"\nZapremina sfere je "+vS);
	}

}
