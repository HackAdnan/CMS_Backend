package com.example.contactmanager.customexceptions;

public class ContactNotFoundException extends RuntimeException
{
    public ContactNotFoundException(String message)
    {
        super(message);
    }
}
