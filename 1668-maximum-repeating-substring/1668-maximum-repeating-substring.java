class Solution {
    public int maxRepeating(String sequence, String word) {
        
        int count = 0;  // Initialize count to track the number of repetitions
        
        // Step 1: Generate all substrings of sequence and store them in a list
        ArrayList<String> substrings = new ArrayList<>();
        for (int i = 0; i < sequence.length(); i++) {
            for (int j = i + 1; j <= sequence.length(); j++) {
                substrings.add(sequence.substring(i, j));
            }
        }
        
        // Step 2: Check how many times word repeats consecutively
        String temp = word;
        for (int i = 0; i < substrings.size(); i++) {
            if (temp.equals(substrings.get(i))) {
                count++;  // If found, increment the count
                temp += word;  // Double the word to check for the next repetition
            }
        }
        
        return count;  // Return the total count of consecutive repetitions
    }
}