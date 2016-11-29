package org.sb.devops.service;

public interface Process {

  /**
   * configuration specific 
   */
  
  void ping();
  
  
  /**
   * component specific 
   */
  
  void registerBuild();

  void createRevision();

  
  /**
   * release specific 
   */
  
  void deploy();

  void scheduleDeploy();

  void forceDeploy();

  void approve();

  void reject();

}
