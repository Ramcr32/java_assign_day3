package com.masai;

public class VandC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VandC d1= new VandC();
		d1.vC('a');
		d1.vC('b');
		d1.vC('0');
		
	}
	void vC(char character) {
		if((int) character>122 || (int) character<65 ) {
			System.out.println("Invalid");
			return ;
		}
		
		if(character=='a' || character=='e' || character=='i'
				|| character=='o' || character=='u'
				|| character=='A' || character=='E' || character=='I'
				|| character=='O' || character=='U') {
			System.out.println("Vowel");
		}
		else {
			System.out.println("Consonant");
		}
	}

}
