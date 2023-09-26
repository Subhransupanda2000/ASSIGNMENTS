# HOW HASHMAP INTERNALLY WORKS
* Hashmap is a collection of array bucket where key value pairs are stored.
* When we add pairs it will store into that bucket.
* In this bucket collision can ouccer for this multiple bucket can carry multiple pairs.
*  buckets are usually use efficient data structure to resolve this problem like tree.
*  When you retrieve a value by a key (using get(key)), the HashMap uses the hash code to find the bucket where the key might be found.
*  then uses the equals() method to search for the exact key within the bucket.
