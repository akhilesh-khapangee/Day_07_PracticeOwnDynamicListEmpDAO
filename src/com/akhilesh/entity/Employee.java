/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akhilesh.entity;

/**
 *
 * @author Akhilesh
 */
public class Employee implements Comparable<Employee> {

    private int empId;
    private String firstName, lastName, email;

    public Employee(int empId, String firstName, String lastName, String email) {
        this.empId = empId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public Employee() {
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int compareTo(Employee empId) {
        int compareId = ((Employee) empId).getEmpId();
        return this.empId - compareId;
    }

}
