package pattern;
public class ShapePattern{
	public void diamond(int size){
		System.out.println("\tDiamond Shape\n");
		int i = 1;
		while(i<= size*2-1){
			System.out.print("\t");
			if(i<=size){
				int s = size - i;
				while(s>=1){
					System.out.print(" ");
					s--;
				}
				int j = 1;
				while(j<=2*i-1){
					if(j%2==1){	
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					j++;
				}
			}
			else{
				int s = i-size;
				while(s>=1){
					System.out.print(" ");
					s--;
				}
				int j = 1;
				while(j<=(2*size-i)*2-1){
					if(j%2==1){	
						System.out.print("*");
					}
					else{
						System.out.print(" ");
					}
					j++;
				}
			}
			System.out.println();
			i++;
		}
	}
	public void arrow(int size){
		System.out.println("\tArrow Shape\n");
		int i = 1;
		while(i<=2*size-1){
			System.out.print("\t");
			int j = 1;
			while(j <= size+1){
				if(i==size && j == size+1){
					int a = 1;
					while(a<=2*size-1){
						System.out.print("||");
						a++;
					}
				}
				else if(j == size+1){
					System.out.print(" | ");
				}
				else if(i<size&& (i+j == size+1)){
					System.out.print(" / ");
				}
				else if(i>size && (i-j == size-1)){
					System.out.print(" \\ ");
				}
				else if(i==size && j == 1){
					System.out.print(" <  ");
				}
				else{
					System.out.print("   ");						
				}
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void house(int no){
		System.out.println("\tHouse Shape\n");
		int i = 1, j;
		while(i<= no){
			System.out.print("\t");
			
				int s = no-i;
				while(s>=1){
					System.out.print("   ");
					s--;
				}
				j = 1;
				while(j<= 2*i-1){
					if(j==1 || j== 2*i-1 || i==1 || i==no){	
						System.out.print(" * ");
					}
					else{
						System.out.print("   ");
					}
					j++;
				}
			System.out.println();
			i++;
		}
		i = 1;
		while(i<= no){
			System.out.print("\t");
		
				j = 1;
				while(j<= 2*no-1){
					if(j==1 || j== 2*no-1){	
						System.out.print(" | ");
					}
					else if(i == no){
						System.out.print(" _ ");
					}
					else if(no-1<=j && j<=no+1 && no/2-1<=i && i<=no/2+1){
						if(i == no/2){
							System.out.print(" | ");
						}
						else{
							System.out.print(" - ");
						}
					}
					else{
						System.out.print("   ");
					}
					j++;
				}
			System.out.println();
			i++;
		}
	}
	public void computer(int size){
		int i,j,n,m;
		m = size;//width of computer
		n = m/2-1;//becoz height is half of width
		i = 1;
		System.out.println("\t Computer Shape");
		while(i<=n){
			System.out.print("\t");
			j = 1;
			while(j<=m){
				if((i<3 ||i==n-4||i==n-3)||(i==n && j>=m/2-5 && j<=m/2+5)){
					System.out.print("-");//(upper-bootom boundary)first2 || last 2 || last line

				}
				else if(((j<3||j>m-2)&& i<n-4)||((i==n-1||i==n-2) && (j==m/2+1||j==m/2-1))){
					System.out.print("|");//(side boundary)before last 2 line||in last 2 line
				}
				else{
					System.out.print(" ");
				}
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
	}
}//end of ShapeTriangle class
