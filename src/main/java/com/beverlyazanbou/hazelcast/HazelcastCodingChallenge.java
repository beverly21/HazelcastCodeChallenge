package com.beverlyazanbou.hazelcast;

import java.io.Serializable;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;

public class HazelcastCodingChallenge implements Runnable, Serializable {
	/** 
	 * @author Beverly Azanbou
	 * We are going to create a  simple task to be executed by the executor.
	 * 
	 */
	  private static final long serialVersionUID = 1L;

	  private String message ;

	  public HazelcastCodingChallenge( String msg ) {
	    this.message = msg;
	  }
	  
	  // create a few extra nodes
	    HazelcastInstance hazelcastInstance2 = Hazelcast.newHazelcastInstance();
	    HazelcastInstance hazelcastInstance3 = Hazelcast.newHazelcastInstance();



      // create the task
	    @Override
	    public void run() {
	      try {
	        Thread.sleep( 1000 );
	      } catch ( InterruptedException e ) {
	      }
	      // print the message to the standard output
	      System.out.println(message );
	    }
	  }
	
