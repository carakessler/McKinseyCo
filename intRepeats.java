import java.util.ArrayList;
import java.util.Arrays;
public class intRepeats {
	public static void main (String args[]){
		int[] numArray = {43,42,2,6,42,5,23,8, 5, 2, 2, 8, 5, 6, 8, 8,42,43,2 };
		ArrayList number = new ArrayList();
		ArrayList freq = new ArrayList();
		int count = 0;
		int[] tempArray = new int[numArray.length];
		for (int i = 0; i < numArray.length; i++) {
			tempArray[i] = numArray[i];
		}	
		Arrays.sort(numArray);

		for (int i = 0; i < numArray.length; i++){
			if (i < (numArray.length-1)){
				if (numArray[i] == numArray[i + 1]){ 
					count++;//counts the duplicates in a row
				}
				else{ //until there are no more duplicates
					number.add(numArray[i]);
					freq.add(++count);
					count = 0; //resets count so it can count the next set of duplicates
				}
			}
			else{
				number.add(numArray[i]);
				freq.add(++count);
				count = 0;
			}
		}
		for (int i = 1; i < freq.size(); i++){
			for (int j = 0; j < (freq.size() - i); j++){
				if ((int)freq.get(j) < (int)freq.get(j+1)){ //if there is less frequency at j than at j+1
					int temp = (int)freq.get(j);					
					freq.set(j, freq.get(j+1));
					freq.set(j+1, temp); 
					temp = (int)number.get(j);
					number.set(j, number.get(j+1));
					number.set(j+1, temp);
					//swapped j and j+1 in number and freq arraylists
				}
			
			}
		}
		for (int i = 0; i < freq.size(); i++){ //print each number for each of the frequencies
			for (int j = 0; j < (int)freq.get(i); j++)
				System.out.println(number.get(i));
		} 		
	}
}
