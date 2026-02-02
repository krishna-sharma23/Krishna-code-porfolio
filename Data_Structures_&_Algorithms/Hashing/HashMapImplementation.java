package Hashing;

import java.util.*;

public class HashMapImplementation {
	class HashMap<K, V>{
		
		//this node is not what we use generally in linked list
		//its just a class to store key:value pair this node
		//will become the data of the node of a linked list....
		
		private class Node{
			K key;
			V value;
			
			Node(K key, V value){
				this.key = key;
				this.value = value;
			}
		}
		
		private int n;//Number of elements(key:value)
		private int N;
		private LinkedList<Node> buckets[];
		
		@SuppressWarnings("unchecked")
		HashMap(){
			N = 4;//bucket size
			this.buckets = new LinkedList[4];
			for(int i = 0; i < 4; i++) {
				buckets[i] = new LinkedList<>();
			}
		}
		
		void put(K key, V value) {
			int bi = hashFunction(key);//this is the index where the pair should be added in the linked list
			int di = searchInLL(key, bi);//this is the index where the node should in the linked list
			
			if(di == -1) {//if the key is not present in the linked list
				buckets[bi].add(new Node(key, value));
				n++;//incrementing the number of elements
			}
			else {//if the key is present
				Node data = buckets[bi].get(di);
			}
		}

		private int searchInLL(K key, int bi) {
			// TODO Auto-generated method stub
			return 0;
		}

		private int hashFunction(K key) {
			// TODO Auto-generated method stub
			return 0;
		}
	}

}
