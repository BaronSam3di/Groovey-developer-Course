def t = new Thread(){ } // this closure impliments the JAVA runnable
t.start()


Thread.start { }
Thread.start('MySecondThread') {} // Multiple threads will need different names os they don't collide with each other.

Thread.start { }
Thread.start('MySecondThread') {}
