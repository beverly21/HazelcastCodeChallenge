package com.beverlyazanbou.hazelcast;

import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IExecutorService;

public class Main {
	public static void main( String[] args ) throws Exception {
	    HazelcastInstance hazelcastInstance = Hazelcast.newHazelcastInstance();

	    //create an executor
	    IExecutorService executor = hazelcastInstance.getExecutorService( "executorServ" );

	    //submit the task to the executor
	      executor.submit( new HazelcastCodingChallenge( "We are Started!" ) );

	  }
	}


