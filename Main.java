
public class Main {
	public static void main (String[] args){
		Atribut a = new Atribut("Ahmad", "Ksatria");
		a.status();
		Atribut b = new Atribut("Bianca", "Penyihir");
		b.setATK(400);
		b.setDEF(50);
		b.setHP(650);
		b.status();
		
		while (a.HP>0||b.HP>0) {
			a.serang(b);
			if(b.HP==0)
				break;
			b.serang(a);
			if(a.HP==0)
				break;
		}
		

	
	
	
	}
}
