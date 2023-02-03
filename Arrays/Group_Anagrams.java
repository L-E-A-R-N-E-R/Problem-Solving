class Group_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> map = new HashMap<>();
        for(int i=0;i<strs.length;i++){
            String og_word = strs[i];
            char[] sorted = strs[i].toCharArray();
            Arrays.sort(sorted);
            String sorted_key = new String(sorted);
            if(map.containsKey(sorted_key)){
                ArrayList<String> list = map.get(sorted_key);
                list.add(og_word);
            }
            else{
                ArrayList<String> list = new ArrayList<>();
                list.add(og_word);
                map.put(sorted_key,list);
            }
        }
        return new ArrayList(map.values());
    }
}