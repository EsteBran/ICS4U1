package AlgorithmPractice;

public class Sort implements Sorter{
	
	protected int type;
	
	public void setList (int[] list) {
		
		for (int i = 0; i < list.length -1; i++) {
			
			for (int j = 0; j < list.length-1- i; j++) {
				
				if (list[j] > list[j+1]) {
					int a = list[j];
					list[j] = list[j+1];
					list[j+1] = a;
				}
			}
		}
	}

	
	public void sort(int type) {
		this.type = type;
		
	}
	
	

}
