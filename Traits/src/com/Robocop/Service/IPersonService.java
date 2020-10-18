package com.Robocop.Service;

public interface IPersonService {
    default void doSomething(){          // rememeber an interface cannot have an body. Default allows us that
        System.out.println("doing something good ...");
    }
}
