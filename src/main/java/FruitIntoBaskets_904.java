class Solution {
    public int totalFruit(int[] tree) {
        Set<Integer> set = new HashSet<Integer>();
        int fruitCount = 0;
        int maxFruitCount = Integer.MIN_VALUE;
        for(int start=0,end=0; end<tree.length; end++){
            if(set.contains(tree[end]) || set.size()<2){
                if(set.size()<2){
                    set.add(tree[end]);
                }
                if(tree[start] != tree[end]){
                    start = end;
                }
                fruitCount++;
            }
            else{
                maxFruitCount = Math.max(maxFruitCount, fruitCount);
                set.clear();
                set.add(tree[start]);
                set.add(tree[end]);
                fruitCount = end-start+1;
                start = end;
            }
        }
        maxFruitCount =	Math.max(maxFruitCount, fruitCount);
        return maxFruitCount;
        /*Set<Integer> set = new HashSet<Integer>();
		int fruitCount = 0;
		int maxFruitCount = Integer.MIN_VALUE;
		for(int start=0,end=0; end<tree.length; end++){
			if(set.contains(tree[end]) || set.size()<2){
				if(set.size()<2){
					set.add(tree[end]);
					start = end;
				}				
				fruitCount++;
			}
			else{
				maxFruitCount = Math.max(maxFruitCount, fruitCount);
				set.clear();
				fruitCount = 0;
				end = start-1;
			}
		}
		maxFruitCount =	Math.max(maxFruitCount, fruitCount);
        return maxFruitCount;
       */
    }
}