# Plagirasim-detection
plagiarism detection script based on the Jaccard similarity index. The script uses a custom iterator with a default word size 3. The Script takes two text files as input and outputs the percentage of how similar they are. When it iterates through the first text it creates a hashtable with words as keys and how often they're used as value. The script goes through the other text counting the number of times words that in both texts are repeated and uses the Jaccard formula to give the similarity J(A,B)= |A intersct B| / |A union B|.

The main program is Pastische.
