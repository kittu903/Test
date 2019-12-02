package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

class MonkVistCoderLand {
	public static void main(String args[] ) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCases = Integer.parseInt(br.readLine());
		for (int i = 0; i < testCases; i++) {
			int numberOfCheckPoints = Integer.parseInt(br.readLine());
			int[] costArray = new int[numberOfCheckPoints];
			int[] petrolAmount = new int[numberOfCheckPoints];

			String costArrayString = br.readLine();
			String[] strNums = costArrayString.split("\\s");
			for (int a = 0; a < strNums.length; a++) {
				costArray[a] = Integer.parseInt(strNums[a]);
			}

			String petrolAmountArrayString = br.readLine();
			String[] ptrNums = petrolAmountArrayString.split("\\s");
			for (int b = 0; b < ptrNums.length; b++) {
				petrolAmount[b] = Integer.parseInt(ptrNums[b]);
			}

			int indexOfLowestPrize = 0;
			for (int j = 0; j < costArray.length; j++) {
				if ((j + 1) < costArray.length) {
					if (costArray[j] < costArray[j + 1]) {
						indexOfLowestPrize = j;
					} else {
						indexOfLowestPrize = j + 1;
					}
				}
			}
			if (indexOfLowestPrize == 0) {
				int price = 0;
				for (int m = 0; m < petrolAmount.length; m++) {
					price = price + (petrolAmount[m] * costArray[0]);
				}
				System.out.println(price);
			}
			if (indexOfLowestPrize != costArray.length && indexOfLowestPrize != 0) {
				int price = 0;
				for (int k = 0; k < costArray.length; k++) {
					if(k == (costArray.length-1)){
						price=price+(costArray[k]*petrolAmount[k]);
					}
					else{
						price=price+(costArray[k]*petrolAmount[k]);
						for(int a=k+1; a<costArray.length;a++){
							if(costArray[k]<costArray[a]){

								price = price + costArray[k]*petrolAmount[a];
							}else{
								k=a-1;
								break;
							}
						}
					}
				}
				System.out.println(price);
			}
		}
	}
}