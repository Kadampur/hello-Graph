import java.util.Scanner;
import java.io.*;
import java.util.*;

public class ReadGraph {
	
	//public ArrayList<LinkedList<String>> 
	public void readCSVFile() throws IOException{
	Scanner sc=new Scanner(System.in);
	String fileName;
	System.out.println("ENTER THE FILE NAME TO READ :");
	fileName=sc.next();
	
	FileReader fr=new FileReader(fileName);
	BufferedReader br=new BufferedReader(fr);
	
	String line=br.readLine();
	int count=0;
	String[] a=new String[2];
	ArrayList<String> fromNodes=new ArrayList<String>();
	ArrayList<String> toNodes=new ArrayList<String>();
	LinkedList<String> lx=new LinkedList<String>();
	ArrayList<LinkedList<String>> lxs=new ArrayList<LinkedList<String>>();
	//LinkedList<String> E=new LinkedList();
	
	
	while(line != null){
		a=line.split(",");
		  
		  fromNodes.add(a[0]);
		  toNodes.add(a[1]); 
		  
		  
		 line=br.readLine(); 
		count++;	
	}
	System.out.println("Object created. Total "+count+" lines read");
	System.out.println("From nodes in the graph are:"+fromNodes);
	System.out.println("to nodes in the graph are:"+toNodes);
	System.out.println("------------------------------");
	System.out.println("THE ADJACENCY LIST OF THE GRAPH IS:");

	for(int i=0; i<fromNodes.size();i++){
		lx.add(fromNodes.get(i));
		lx.add(toNodes.get(i));
		for(int j=i; j<fromNodes.size()-1; j++){	
			if(fromNodes.get(i).equals(fromNodes.get(j+1))){
			lx.add(toNodes.get(j+1));
			}	
		}	
		LinkedList E=new LinkedList(lx);
		lxs.add(E);
		System.out.println(lx);
		lx.clear();
	}
	System.out.println("------------------------------");
	System.out.println("THE ADJACENCY LIST OBJECT IS:");
    System.out.println(lxs);
	//System.out.println(lxs.get(0));
	//return(lxs);
}

}
	
