# Ex9: Threads
Create a new project called MyRunnableProject as follows:   
*	Create a class called MyCurrentDate that implements Runnable interface and also create a thread object.
*	The MyCurrentDate class displays the current date and time 10 times, with 100 mili seconds interval - use sleep() method for this interval.
*	Create a class called MyMain, which contains main() method, in which 3 instances of MyCurrentDate threads are being run.
*	Create a stop() method using interrupt() which will happen after sleep time.
