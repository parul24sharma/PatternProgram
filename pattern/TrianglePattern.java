package pattern;
public class TrianglePattern{
	public void oddTriangle(int size){
		System.out.println("\tOdd Triangle Pattern\n");
		int i = 1;
		while(i<=size){
			System.out.print("\t");
			int s = size-i;
			while(s>=1){
				System.out.print("   ");
				s--;
			}
			int j = 1;
			while(j <= 2*i-1){
				System.out.print(" "+(2*i-1)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void evenTriangle(int size){
		System.out.println("\tEven Triangle Pattern\n");
		int i=0;
		while(i< size){
			System.out.print("\t");
			int s = size-i;
			while(s>1){
				System.out.print("   ");
				s--;
			}
			int j =0;
			while(j<=i){
				System.out.print(" "+(2*i)+" ");
				j++;
			}
			System.out.println();
			i++;
		}
	}
	public void pascalTriangle(int size){
		System.out.println("\tSum Triangle Pattern\n");
		int[] a = new int[size];
		int[] b = new int[size];
		int i = 0;
		while(i<size){
			System.out.print("\t");
			int j = 0;
			while(j<=i){
				if(j ==0 || j==i){
					System.out.print(" 1 ");
					a[j] = b[j] = 1;
				}
				else{
					b[j] = a[j] + a[j-1];
					System.out.print(" "+ b[j] +" ");
				}
				j++;
			}
			j = 0;
			while(j<a.length){
				a[j] = b[j];
				j++;
			}
			System.out.print("\n");
			i++;
		}
	}
	public void noTriangle(int size){
		System.out.println("\tNumber Triangle Pattern\n");
		int i=1, k=1;
		while(i<=size){
			System.out.print("\t");
			int s = size-i;
			while(s >= 1){
				System.out.print("   ");
				s--;
			}
			int j = 1;
			while(j <= i){
				if(k/10 == 0){
					System.out.print(" 0"+ k);
				}
				else{
					System.out.print(" "+ k);
				}
				System.out.print("   ");
				k++;
				j++;
			}
			System.out.println();
			i++;
		}
	}
}//end of TrianglePattern class