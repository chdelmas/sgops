/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ht.gouv.faes.sgops.view;

import java.util.Calendar;

/**
 *
 * @author chdelmas
 */
public class Todo {
  private String id;
  private String title;
  private String description;
  private int priority;
  private Calendar dueDate;
  
  public Todo(String title, String description, int priority) {
    this.title = title;
    this.description = description;
    this.priority = priority;
  }
  
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }
  
  public int getPriority() {
    return priority;
  }

  public void setPriority(int priority) {
    this.priority = priority;
  } 
  
  public Calendar getDueDate() {
    return dueDate;
  }
  public void setDueDate(Calendar dueDate) {
    this.dueDate = dueDate;
  }

   
} 