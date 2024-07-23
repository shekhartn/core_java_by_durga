Multi Threading
Agenda 
1. Introduction.
2. The ways to define, instantiate and start a new Thread.
	1. By extending Thread class
	2. By implementing Runnable interface
3. Thread class constructors
4. Thread priority
5. Getting and setting name of a Thread.
6. The methods to prevent(stop) Thread execution.
	1. yield()
	2. join()
	3. sleep()
7. Synchronization.
8. Inter Thread communication.
9. Deadlock
10. Daemon Threads.
11. Various Conclusion 
	1. To stop a Thread
	2. Suspend & resume of a thread
	3. Thread group 
	4. Green Thread
	5. Thread Local
12. Life cycle of a Thread

Introduction
Multitasking: Executing several tasks simultaneously is the concept of multitasking. 
There are two types of multitasking's. 
	1. Process based multitasking.
	2. Thread based multitasking.
Process based multitasking:
	Executing several tasks simultaneously where each task is a separate independent 
	process such type of multitasking is called process based multitasking. 
Example: 
	1.While typing a java program in the editor we can able to listen mp3 audio songs 
	at the same time we can download a file from the net all these tasks are 
	independent of each other and executing simultaneously and hence it is Process 
	based multitasking.
	2.This type of multitasking is best suitable at "os level".

Thread based multitasking:
Executing several tasks simultaneously where each task is a separate independent part 
of the same program, is called Thread based multitasking.
And each independent part is called a "Thread". 
	1. This type of multitasking is best suitable for "programatic level".
	2. When compared with "C++", developing multithreading examples is very easy 
	in java because java provides in built support for multithreading through a rich 
	API (Thread, Runnable, ThreadGroup, ThreadLocal...etc).
	3. In multithreading on 10% of the work the programmer is required to do and 
	90% of the work will be down by java API.
	4. The main important application areas of multithreading are: 
		1. To implement multimedia graphics.
		2. To develop animations.
		3. To develop video games etc.
		4. To develop web and application servers
	5. Whether it is process based or Thread based the main objective of multitasking 
		is to improve performance of the system by reducing response time.
We can define a Thread in the following 2 ways. 
	1. By extending Thread class.
	2. By implementing Runnable interface.

Case 1: Thread Scheduler:
			1.If multiple Threads are waiting to execute then which Thread will execute 1st is 
			decided by "Thread Scheduler" which is part of JVM.
			
			2.Which algorithm or behavior followed by Thread Scheduler we can't expect 
			exactly it is the JVM vendor dependent hence in multi threading examples we 
			can't expect exact execution order and exact output.

Case 2: Difference between t.start() and t.run() methods.
			1.In the case of t.start() a new Thread will be created which is responsible for the 
			execution of run() method.
			2.But in the case of t.run() no new Thread will be created and run() method will be 
			executed just like a normal method by the main Thread.
			3.In the above program if we are replacing t.start() with t.run() the following is the 
			output.
Case 3: importance of Thread class start() method.
			For every Thread the required mandatory activities like registering the Thread with 
			Thread Scheduler will takes care by Thread class start() method and programmer is 
			responsible just to define the job of the Thread inside run() method. 
			That is start() method acts as best assistant to the programmer. 
			Example:
			start()
			{
			1. Register Thread with Thread Scheduler
			2. All other mandatory low level activities.
			3. Invoke or calling run() method.
			}
			We can conclude that without executing Thread class start() method there is no chance 
			of starting a new Thread in java. Due to this start() is considered as heart of 
			multithreading.
Case 4: If we are not overriding run() method:
			If we are not overriding run() method then Thread class run() method will be executed 
			which has empty implementation and hence we won't get any output. 
			Example:
			class MyThread extends Thread 
			{}
			class ThreadDemo
			{
			public static void main(String[] args)
			{
			MyThread t=new MyThread();
			t.start();
			}
			}
			It is highly recommended to override run() method. Otherwise don't go for 
			multithreading concept.
Case 5: Overloading of run() method.
			We can overload run() method but Thread class start() method always invokes no 
			argument run() method the other overload run() methods we have to call explicitly then 
			only it will be executed just like normal method.
Case 6: overriding of start() method:
			If we override start() method then our start() method will be executed just like a normal 
			method call and no new Thread will be started.
Case 8: life cycle of the Thread:
			1. Once we created a Thread object then the Thread is said to be in new state or 
			born state.
			2. Once we call start() method then the Thread will be entered into Ready or 
			Runnable state.
			3 If Thread Scheduler allocates CPU then the Thread will be entered into running 
			state.
			4. Once run() method completes then the Thread will entered into dead state.
Case 9: After starting a Thread we are not allowed to restart the same Thread once again 
		otherwise we will get runtime exception saying "IllegalThreadStateException".

2. By implementing Runnable interface
Best approach to define a Thread:
	1. Among the 2 ways of defining a Thread, implements Runnable approach is 
	always recommended.
	2. In the 1st approach our class should always extends Thread class there is no 
	chance of extending any other class hence we are missing the benefits of 
	inheritance.
	3. But in the 2nd approach while implementing Runnable interface we can extend 
	some other class also. Hence implements Runnable mechanism is recommended 
	to define a Thread.
Thread class constructors:
	1. Thread t=new Thread();
	2. Thread t=new Thread(Runnable r);
	3. Thread t=new Thread(String name);
	4. Thread t=new Thread(Runnable r,String name);
	5. Thread t=new Thread(ThreadGroup g,String name);
	6. Thread t=new Thread(ThreadGroup g,Runnable r);
	7. Thread t=new Thread(ThreadGroup g,Runnable r,String name);
	8. Thread t=new Thread(ThreadGroup g,Runnable r,String name,long stackSize);
Getting and setting name of a Thread:
	1. Every Thread in java has some name it may be provided explicitly by the
	programmer or automatically generated by JVM.
	2. Thread class defines the following methods to get and set name of a Thread.
	Methods: 
	1. public final String getName()
	2. public final void setName(String name)
Thread Priorities
	1. Every Thread in java has some priority it may be default priority generated by 
	JVM (or) explicitly provided by the programmer.
	The valid range of Thread priorities is 1 to 10[but not 0 to 10] where 1 is the least 
	priority and 10 is highest priority.
	2. Thread class defines the following constants to represent some standard 
	priorities. 
		1. Thread. MIN_PRIORITY----------1
		2. Thread. MAX_PRIORITY----------10
		3. Thread. NORM_PRIORITY--------5
	3. There are no constants like Thread.LOW_PRIORITY, 
	Thread.HIGH_PRIORITY
	4. Thread scheduler uses these priorities while allocating CPU.
	5. The Thread which is having highest priority will get chance for 1st execution.
	6. If 2 Threads having the same priority then we can't expect exact execution order 
	it depends on Thread scheduler whose behavior is vendor dependent.
	7. We can get and set the priority of a Thread by using the following methods. 
		1. public final int getPriority()
		2. public final void setPriority(int newPriority);//the allowed values are 1 to 
		10
	8. The allowed values are 1 to 10 otherwise we will get runtime exception saying 
	"IllegalArgumentException".
	
Default priority:
	The default priority only for the main Thread is 5. But for all the remaining Threads 
	the default priority will be inheriting from parent to child. That is whatever the priority 
	parent has by default the same priority will be for the child also.
	
The Methods to Prevent a Thread from Execution:
	We can prevent(stop) a Thread execution by using the following methods. 
		1. yield();
		2. join();
		3. sleep();
	yield():
		1. yield() method causes "to pause current executing Thread for giving the chance 
		of remaining waiting Threads of same priority".
		2. If all waiting Threads have the low priority or if there is no waiting Threads then 
		the same Thread will be continued its execution.
		3. If several waiting Threads with same priority available then we can't expect 
		exact which Thread will get chance for execution.
		4. The Thread which is yielded when it get chance once again for execution is 
		depends on mercy of the Thread scheduler.
		5. public static native void yield();
	Join():
		1.If a Thread wants to wait until completing some other Thread then we should go for 
			join() method. 
			Example: If a Thread t1 executes t2.join() then t1 should go for waiting state until 
			completing t2.
		2.methods
			1. public final void join()throws InterruptedException
			2. public final void join(long ms) throws InterruptedException
			3. public final void join(long ms,int ns) throws InterruptedException
	Sleep() method:
		If a Thread don't want to perform any operation for a particular amount of time then 
		we should go for sleep() method.
		
Interrupting a Thread:
	Q:How a Thread can interrupt another thread ?
	A:If a Thread can interrupt a sleeping or waiting Thread by using interrupt()(break off) 
		method of Thread class. 
		public void interrupt();
		
	Note: 
		1. Whenever we are calling interrupt() method we may not see the effect 
		immediately, if the target Thread is in sleeping or waiting state it will be 
		interrupted immediately.
		2. If the target Thread is not in sleeping or waiting state then interrupt call will 
		wait until target Thread will enter into sleeping or waiting state. Once target 
		Thread entered into sleeping or waiting state it will effect immediately.
		3. In its lifetime if the target Thread never entered into sleeping or waiting state 
		then there is no impact of interrupt call simply interrupt call will be wasted.
Synchronization:
		1. Synchronized is the keyword applicable for methods and blocks but not for 
		classes and variables.
		2. If a method or block declared as the synchronized then at a time only one 
		Thread is allow to execute that method or block on the given object.
		3. The main advantage of synchronized keyword is we can resolve date 
		inconsistency problems.
		4. But the main disadvantage of synchronized keyword is it increases waiting time 
		of the Thread and effects performance of the system.
		5. Hence if there is no specific requirement then never recommended to use 
		synchronized keyword.
		6. Internally synchronization concept is implemented by using lock concept.
		7. Every object in java has a unique lock. Whenever we are using synchronized 
		keyword then only lock concept will come into the picture.
		8. If a Thread wants to execute any synchronized method on the given object 1st it 
		has to get the lock of that object. Once a Thread got the lock of that object then 
		it's allow to execute any synchronized method on that object. If the synchronized 
		method execution completes then automatically Thread releases lock.
		9. While a Thread executing any synchronized method the remaining Threads are 
		not allowed execute any synchronized method on that object simultaneously. But 
		remaining Threads are allowed to execute any non-synchronized method 
		simultaneously. [lock concept is implemented based on object but not based on 
		method].
Class level lock:
		1. Every class in java has a unique lock. If a Thread wants to execute a static 
		synchronized method then it required class level lock.
		2. Once a Thread got class level lock then it is allow to execute any static 
		synchronized method of that class.
		3. While a Thread executing any static synchronized method the remaining 
		Threads are not allow to execute any static synchronized method of that class 
		simultaneously.
		4. But remaining Threads are allowed to execute normal synchronized methods, 
		normal static methods, and normal instance methods simultaneously.
		5.Class level lock and object lock both are different and there is no relationship between these two.
Synchronized block:
		1. If very few lines of the code required synchronization then it's never 
		recommended to declare entire method as synchronized we have to enclose those 
		few lines of the code with in synchronized block.
		2. The main advantage of synchronized block over synchronized method is it 
		reduces waiting time of Thread and improves performance of the system.
		Example 1: To get lock of current object we can declare synchronized block as follows.
		If Thread got lock of current object then only it is allowed to execute this block.
		Synchronized(this){} 
		Example 2: To get the lock of a particular object 'b' we have to declare a synchronized 
		block as follows.
		If thread got lock of 'b' object then only it is allowed to execute this block.
		Synchronized(b){} 
		Example 3: To get class level lock we have to declare synchronized block as follows.
		Synchronized(Display.class){} 
		If thread got class level lock of Display then only it allowed to execute this block. 
		Note:As the argument to the synchronized block we can pass either object reference or 
		".class file" and we can't pass primitive values as argument [because lock concept is 
		dependent only for objects and classes but not for primitives].

Questions:
		1. Explain about synchronized keyword and its advantages and disadvantages?
		2. What is object lock and when a Thread required?
		3. What is class level lock and when a Thread required?
		4. What is the difference between object lock and class level lock?
		5. While a Thread executing a synchronized method on the given object is the 
		remaining Threads are allowed to execute other synchronized methods 
		simultaneously on the same object? 
		Ans: No. 
		6. What is synchronized block and explain its declaration?
		7. What is the advantage of synchronized block over synchronized method?
		8. Is a Thread can hold more than one lock at a time? 
		Ans: Yes, up course from different objects. Example:
		
		10. What is synchronized statement? 
		Ans: The statements which present inside synchronized method and 
		synchronized block are called synchronized statements. [Interview people 
		created terminology
Producer consumer problem:
		1. Producer(producer Thread) will produce the items to the queue and 
		consumer(consumer thread) will consume the items from the queue. If the queue 
		is empty then consumer has to call wait() method on the queue object then it will 
		entered into waiting state.
		2 After producing the items producer Thread call notify() method on the queue to 
		give notification so that consumer Thread will get that notification and consume 
		items.
Notify vs notifyAll():
		1 We can use notify() method to give notification for only one Thread. If multiple 
		Threads are waiting then only one Thread will get the chance and remaining 
		Threads has to wait for further notification. But which Thread will be 
		notify(inform) we can't expect exactly it depends on JVM.
		2 We can use notifyAll() method to give the notification for all waiting Threads. All 
		waiting Threads will be notified and will be executed one by one, because they 
		are required lock
		Note: On which object we are calling wait(), notify() and notifyAll() methods that 
		corresponding object lock we have to get but not other object locks.
Dead lock:
		1. If 2 Threads are waiting for each other forever(without end) such type of 
		situation(infinite waiting) is called dead lock.
		2. There are no resolution techniques for dead lock but several 
		prevention(avoidance) techniques are possible.
		3. Synchronized keyword is the cause for deadlock hence whenever we are using 
		synchronized keyword we have to take special care.
Daemon Threads:
	The Threads which are executing in the background are called daemon Threads.
	The main objective of daemon Threads is to provide support for non-daemon Threads 
	like main Thread.
	Example: 
	Garbage collector
	1.When ever the program runs with low memory the JVM will execute Garbage Collector 
	to provide free memory. So that the main Thread can continue it's execution. 
	2. We can check whether the Thread is daemon or not by using isDaemon() method 
	of Thread class. 
	public final boolean isDaemon(); 
	3. We can change daemon nature of a Thread by using setDaemon () method. 
	public final void setDaemon(boolean b); 
	4. But we can change daemon nature before starting Thread only. That is after 
	starting the Thread if we are trying to change the daemon nature we will get R.E 
	saying IllegalThreadStateException.
	5. Default Nature : Main Thread is always non daemon and we can't change its 
	daemon nature because it's already started at the beginning only.
	6. Main Thread is always non daemon and for the remaining Threads daemon 
	nature will be inheriting from parent to child that is if the parent is daemon child 
	is also daemon and if the parent is non daemon then child is also non daemon.
	7. Whenever the last non daemon Thread terminates automatically all daemon 
	Threads will be terminated.
Deadlock vs Starvation:
	1. A long waiting of a Thread which never ends is called deadlock.
	2. A long waiting of a Thread which ends at certain point is called starvation.
	3. A low priority Thread has to wait until completing all high priority Threads.
	4. This long waiting of Thread which ends at certain point is called starvation.
How to kill a Thread in the middle of the line?
	1. We can call stop() method to stop a Thread in the middle then it will be entered 
	into dead state immediately.
	public final void stop(); 
	2. stop() method has been deprecated and hence not recommended to use.
suspend and resume methods:
	 A Thread can suspend another Thread by using suspend() method then that 
	Thread will be paused temporarily.
	 A Thread can resume a suspended Thread by using resume() method then 
	suspended Thread will continue its execution. 
	1. public final void suspend();
	2. public final void resume();
	 Both methods are deprecated and not recommended to use.
RACE condition:
	Executing multiple Threads simultaneously and causing data inconsistency problems is 
	nothing but Race condition
	we can resolve race condition by using synchronized keyword.
ThreadGroup:
	Based on functionality we can group threads as a single unit which is nothing but 
	ThreadGroup.
	ThreadGroup provides a convenient way to perform common operations for all threads 
	belongs to a particular group.
GreenThread:
	Java multiThreading concept is implementing by using the following 2 methods : 
		1. GreenThread Model
		2. Native OS Model
	GreenThread Model
		The threads which are managed completely by JVM without taking support for 
		underlying OS, such type of threads are called Green Threads. 
	Native OS Model
		1 The Threads which are managed with the help of underlying OS are called 
		Native Threads. 
		2 Windows based OS provide support for Native OS Model 
		3 Very few OS like SunSolaries provide support for GreenThread Model 
		4 Anyway GreenThread model is deprecated and not recommended to use.
ThreadGroup:
	1. Based on the Functionality we can Group Threads into a Single Unit which is 
	Nothing but ThreadGroup i.e. ThreadGroup Represents a Set of Threads.
	2. In Addition a ThreadGroup can Also contains Other SubThreadGroups
	3 ThreadGroup Class Present in java.lang Package and it is the Direct Child Class of 
	Object.
	4 ThreadGroup provides a Convenient Way to Perform Common Operation for all 
	Threads belongs to a Particular Group.
	Eg:Stop All Consumer Threads. Suspend All Producer Threads.
	
	Constructors:
		1) ThreadGroup g = new ThreadGroup(String gname);
			a. Createsa New ThreadGroup.
			b. The Parent of this New Group is the ThreadGroup of Currently Running 
			Thread.
		2) ThreadGroup g = new ThreadGroup(ThreadGrouppg, String gname);
			a. Creates a New ThreadGroup.
			b. The Parent of this ThreadGroup is the specified ThreadGroup.
	Note:
		1. In Java Every Thread belongs to Some Group. 
		2. Every ThreadGroup is the Child Group of System Group either Directly OR 
		Indirectly. Hence SystemGroup Acts as Root for all ThreadGroup’s in Java.
		3. System ThreadGroup Represents System Level Threads Like ReferenceHandler, 
		SignalDispatcher, Finalizer, AttachListener Etc.
	Important Methods of ThreadGroup Class:
		1) String getName();Returns Name of the ThreadGroup.
		2) intgetMaxPriority();Returns the Maximum Priority of ThreadGroup.
		3) void setMaxPriority(); 
			a. To Set Maximum Priority of ThreadGroup. 
			b. The Default Maximum Priority is 10.
			c. Threads in the ThreadGroup that Already have Higher Priority, Not effected 
			but Newly Added Threads this MaxPriority is Applicable.
		4) ThreadGroupgetParent(): Returns Parent Group of Current ThreadGroup.
		5) void list(): It Prints Information about ThreadGroup to the Console.
		6) intactiveCount(): Returns Number of Active Threads Present in the ThreadGroup.
		7) intactiveGroupCount(): It Returns Number of Active ThreadGroups Present in the 
		Current ThreadGroup.
		8) int enumerate(Thread[] t): To Copy All Active Threads of this Group into provided 
		Thread Array. In this Case SubThreadGroup Threads also will be Considered.
		9) int enumerate(ThreadGroup[] g): To Copy All Active SubThreadGroups into 
		ThreadGroupArray
		10) booleanisDaemon():
		11) void setDaemon(boolean b):
		12) void interrupt(): To Interrupt All Threads Present in the ThreadGroup.
		13) void destroy(): To Destroy ThreadGroup and its SubThreadGroups.
ThreadLocal:
		1. ThreadLocalProvides ThreadLocal Variables.
		2. ThreadLocal Class Maintains Values for Thread Basis.
		3. Each ThreadLocal Object Maintains a Separate Value Like userID, 
		transactionIDEtc for Each Thread that Accesses that Object.
		4. Thread can Access its Local Value, can Manipulates its Value and Even can Remove 
		its Value.
		5. In Every Part of the Code which is executed by the Thread we can Access its Local 
		Variables.
		Eg:1.Consider a Servlet which Calls Some Business Methods. we have a Requirement to 
		generate a Unique transactionID for Each and Every Request and we have to Pass 
		this transactionID to the Business Methods for Logging Purpose.
		2. For this Requirement we can Use ThreadLocal to Maintain a Separate 
		transactionID for Every Request and for Every Thread. 
		Note:
			☀ ThreadLocal Class introduced in 1.2 Version.
			☀ ThreadLocal can be associated with Thread Scope.
			☀ All the Code which is executed by the Thread has Access to Corresponding 
			ThreadLocal Variables.