// Day 14: Scope

	// Add your code here
    Difference(int[] a)
        {
        this.elements = a;
    }
   void computeDifference(){
       Arrays.sort(elements);
       maximumDifference = elements[elements.length-1] - elements[0];
   }
