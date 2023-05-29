package bridgelabz;

public class HashTableMain {
	 public static void main(String[] args) {
	        String paraGraph = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

	        HashTable<String, Integer> hashTable = new HashTable(6);


	        String[] wordsArray = paraGraph.split(" ");
	        for (String word : wordsArray) {
	     Integer currentFrequency = hashTable.get(word);
	             if(currentFrequency == null)
	                 currentFrequency = 1;
	             else
	                 currentFrequency++;
	             hashTable.addOrUpdate(word,currentFrequency);
	        }

	        System.out.println(hashTable);
	        
	        
	        if(hashTable.remove("avoidable"))
	            System.out.println("Given Word is Removed!");
	        else
	            System.out.println("Word is NOT Removed!");

	        System.out.println(hashTable);
	    }
	 
	}

