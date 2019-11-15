package pattern;
public class NumberPattern{
	public void number(int n){
		System.out.println("\t Number is "+n+"\n");
		int i=1;
		while(i<=9){
			System.out.print("\t");
			int j = 1;
			while(j<=5){
				if(n==0){
					if(i==1 || i==9 || j==1 ||j==5){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==1){
					if(j==3){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==2){
					if(i==1 || i==5 || i==9 || (i<5 && j==5) || (i>5&&j==1)){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==3){
					if(j==5 || i==5 || i==1 || i==9){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==4){
					if(j==5 || i==5 || (i<5&&j==1)){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==5){
					if(i==1 || i==5 || i==9 || (i<5&&j==1) || (i>5&&j==5)){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==6){
					if(j==1 || i==1 || i==5 || i==9 ||(i>5&&j==5)){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==7){
					if(j==5 || i==1){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==8){
					if(j==1||j==5||i==1||i==5||i==9){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				else if(n==9){
					if((i<5&&j==1)||j==5||i==1||i==5||i==9){
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
}//end of NumberPattern class
