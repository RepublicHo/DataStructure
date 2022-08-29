# Synchronization

A thread is like a borrower at a library. The thread 
borrows from a central pool of resources. Threads 
make programs more efficient by sharing memory, file handles, 
sockets and other resources. 

As long as two threads dont want to use the same resource 
at the same time, a multithreaded program is much more efficient
than the multiprocessing alternative, in which process
has to keep its own copy of every resource. The downside 
of a multithreaded program is that if two threads want the 
same resource at the same time, one of them
will have to wait for the other to finish. If 
one of them doesn;t wait, the resource may get corrupted. 

We need a way to assign exclusive access to a shared 
resource to one thread. 

### Synchronized Blocks

Java provides no means to stop all other threads 
from using a shared resource. It can only prevent other threads
that synchronize on the same object from using the 
shared resource. 

PrintStream class internally synchronizes most methods 
on the PrintStream object. Most other Output Stream subclasses
do not synchronize themselves. 

Synchronization must be considered any time multiple
threads share resources. Synchronization becomes an issue
only when two threads both process references to the same
object. 

### Synchronized Methods

Simply adding the synchronized modifier to all methods 
is not a catchall solution for synchornization problems. 
For one thing, it exacts a severe performance penalty in many
VMs. Second, it dramatically incrteases the chances of deadlock. 

Third, and most importantly, synchronizing on the instance of the methods' class
may not protect the obkect we really need to protect. 

## Alternatives to Synchronization

Synchronization is not always the best solution to the problem of 
inconsistent behaviour. There are a number of techniques that avoid
the need for synchronization entirely. 

The first is to **use lcoal variables instead of fields wherever possible**
Local variables don't have synchronization problems. Every time
a method is entered, the virtual machine
creates a completely new set of local variables for the method. These
variables are invisible from the outside the method and are destroyed
when the method exists. Thus, it's impossible for one variable
to be shared by two different threads. Every thread has its own separate set
of local variables. 

Method arguments (就是（）里面传递的值) of primitive types are also safe 
from modification in separate methods