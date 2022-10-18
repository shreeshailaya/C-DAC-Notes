# Day 1 1/7

## What is OS ?

- OS is the system software which creates the platform for other software and applications.
  - Interface between user and hardware
  - Resource Allocator
  - Program Controller

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/1_os.png)

- **System Software**
- It is the type of computer program that is designed to run computer hardware and application.
- The OS is the is best known example of system software
- OS manage all other programs in computer.
- Some of Example of System Software
  - BIOS
  - Boot Program
  - Assembler
  - Device Driver

---

### Functions of OS

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/2_os.png)

- **Command Interpreter**
  One of the major functions of OS is commands.
- OS need to provide the interface to the user for the communcation with the computer.
- A Command Interpreter is a program which reads the instruction given by the user.
- Command Interpreter provides a user interface to hide hardware details of the system from the user making system more user friendly.

- Two common Method for interfacing
  - Command Line Interface(CLI)
  - Graphical User Interface(GUI)

---

### Types of OS

- Batched OS
- Time Sharing OS
- Distributed OS
- Network OS
- Real Time OS

---

### Important Terminologies

- RAM vs ROM
- SRAM vs DRAM
- PROM, EPROM & EEROM
- Virtualisation vs Containerisation
- BIOS vs UEFI
- MBR vs GPT
- Compiler, Loader, Assembler, Interpreter, System Calls, Application Programming Interface, Kernel, Shell, JVM, Booting

---

### MultiProgramming:



**Definition:** Multiprogramming is a rudimentary form of parallel processing in 
which several programs run at the same time on a uniprocessor system.
However, because there is only one processor, there is no true 
simultaneous execution of different programs. Instead, the operating 
system (OS) *executes part of one program, then part of another, and
so on.* In this sense, multiprogramming can be thought of as 
pseudo-parallelism. To the user, it appears that multiple programs 
are executing at the same time, but that is not what is happening.



* Prior to the introduction of multiprogramming, single processor 
computers could run only one program at a time. Once the program 
was launched, it ran to completion, unless it was interrupted or 
the application ceded control. Only after the first program finished 
running could the processor execute the next program in the queue.
This meant that the CPU sat idle during I/O operations, even if 
other programs were waiting, resulting in application delays and 
underutilized processor resources.

* Multiprogramming addresses this issue by allowing multiple programs 
to load into memory and run each one in rotation as CPU resources 
become available. For example, when Program A starts, the operating 
system assigns CPU resources to that program until the program launches
 into its I/O operations. Then, the OS assigns CPU resources to 
 Program B, which is already loaded into memory. If Program B 
 launches into I/O operations and Program A is still running its 
 I/O operations, the OS will assign CPU resources to Program C; 
 otherwise, it will assign them back to Program A.

* The operating system is responsible for ensuring that CPU resources 
are properly allocated and reallocated to each program as resources 
become available, working around the various program's I/O operations.
 To achieve this, the OS uses a technique called context switching, which ensures that a program's state is preserved in memory and can be readily accessed as the OS switches between programs and CPU assignments.

![image](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/multiprogramming_01.png)

### Types of multiprogramming:

* Multiprogramming is implemented in one of two ways: 
   * cooperative multiprogramming 
   * preemptive multiprogramming.

* Cooperative multiprogramming is the older of the two models and is seldom used today. With cooperative multiprogramming, context switching is initiated by the programs themselves rather than the OS. Processor resources are reassigned only when a program releases control of those resources. The operating system has no choice but to execute a program with the expectation, but not the certainty, that the program will eventually return control to the OS.

* The problem with this approach is that a program can monopolize CPU resources for an inordinate amount of time, keeping other programs waiting. Even worse, a buggy or malicious program might launch an infinite loop and never give up control of the CPU, resulting in a locked system or system crash. Not only does this disrupt user and application workflows, but it can be difficult to debug because it might not be obvious which of several programs is at fault.

* With preemptive multiprogramming, the OS has complete control over context switching. It allocates CPU resources based on queued programs and their I/O operations, while limiting the time each program can run. So, if there is a problem with one of the programs, it cannot interfere with operations indefinitely. Today, most computers use preemptive multiprogramming.

* **Examples of multiprogramming operating systems are Windows, IOS, Excel, Firefox, etc.**

---

### MultiProcessing

**Definition:**
Multiprocessing refers to the ability of a system to support more than one processor at the same time. Applications in a multiprocessing system are broken to smaller routines that run independently. The operating system allocates these threads to the processors improving performance of the system.

![image](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/multiprocessing_01.png)

**Advantages:**

* The advantages of multiprocessor systems are as follows −

  * If there are multiple processors working at the same time, more processes can be executed parallel at the same time. Therefore the throughput of the system will increase.

  * Multiprocessor systems are more reliable. Due to the fact that there are more than one processor, in case of failure of any one processor will not make the system come to a halt. Although the system will become slow if it happens but still it will work.

  * Electricity consumption of a multiprocessor system is less than the single processor system. This is because, in single processor systems, many processes have to be executed by only one processor so there is a lot of load on it. But in case of multiple processor systems, there are many processors to execute the processes so the load on each processor will be comparatively less so electricity consumed will also be less.

**Fields:**

* The different fields of multiprocessor operating systems used are as follows −

  * Asymmetric Multiprocessor − Every processor is given seeded tasks in this operating system, and the master processor has the power for running the entire system. In the course, it uses the master-slave relationship.

  * Symmetric Multiprocessor − In this system, every processor owns a similar copy of the OS, and they can make communication in between one another. All processors are connected with peering relationship nature, meaning it won’t be using master & slave relation.

  * Shared memory Multiprocessor − As the name indicates, each central processing unit contains distributable common memory.

  * Uniform Memory Access Multiprocessor (UMA) − In this system, it allows accessing all memory at a consistent speed rate for all processors.

  * Distributed memory Multiprocessor − A computer system consisting of a range of processors, each with its own local memory, connected through a network, which means all the kinds of processors consist of their own private memory.

  * NUMA Multiprocessor − The abbreviation of NUMA is Non-Uniform Memory Access Multiprocessor. It entails some areas of the memory for approaching at a swift rate and the remaining parts of memory are used for other tasks.

* **The best Operating system in multiprocessor and parallel computing environment is *UNIX*.**
---

### MultiTasking:


**Definition:**
Multitasking is a logical extension of a multiprogramming system that enables the execution of multiple programs simultaneously. In an operating system, multitasking allows a user to perform more than one computer task simultaneously. Multiple tasks are also known as processes that share similar processing resources like a CPU. The operating system keeps track of where you are in each of these jobs and allows you to transition between them without losing data.

* Multitasking
Early operating system could execute various programs at the same time, although multitasking was not fully supported. As a result, a single software could consume the entire CPU of the computer while completing a certain activity. Basic operating system functions, such as file copying, prevented the user from completing other tasks, such as opening and closing windows. Fortunately, because modern operating systems have complete multitasking capability, numerous programs can run concurrently without interfering with one other. In addition, many operating system processes can run at the same time.

* Examples of multitasking OS are MS-DOS, CP/M, PalmOS, Windows up to Win95, MacOS up to MacOS 9.

![image](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/multitasking_01.png)

**Types of Multitasking:**
* There are mainly two types of multitasking. These are as follows:

  * Preemptive Multitasking
  * Cooperative Multitasking
* **Preemptive Multitasking:**

  * Preemptive multitasking is a special task assigned to a computer operating system. It decides how much time one task spends before assigning another task to use the operating system. Because the operating system controls the entire process, it is referred to as 'preemptive'.

  * Preemptive multitasking is used in desktop operating systems. Unix was the first operating system to use this method of multitasking. Windows NT and Windows 95 were the first versions of Windows that use preemptive multitasking. With OS X, the Macintosh acquired proactive multitasking. This operating system notifies programs when it's time for another program to take over the CPU.

* **Cooperative Multitasking:**

  * The term 'Non-Preemptive Multitasking' refers to cooperative multitasking. The main purpose of cooperative multitasking is to run the present task while releasing the CPU to allow another process to run. This task is carried out by using taskYIELD (). When the taskYIELD() function is called, context-switch is executed.

  * Windows and MacOS used cooperative multitasking. A Windows program will respond to a message by performing some short unit of work before handing the CPU over to the operating system until the program receives another message. It worked perfectly as long as all programs were written with other programs in mind and bug-free.

**Advantages and Disadvantages of Multitasking:**


**Advantages:**

* **Manage Several Users:**

  * This operating system is more suited to supporting multiple users simultaneously, and multiple apps can run smoothly without interfering with system performance.

* **Virtual Memory**

  * The greatest virtual memory system is found in multitasking operating systems. Because of virtual memory, any program does not require a long wait time to complete its tasks; if this problem arises, those programs are moved to virtual memory.

* **Good Reliability**

  * Multitasking operating systems give more flexibility to several users, and they are happier as a result. On which each user can execute single or multiple programs simultaneously.

* **Secured Memory**

  * The multitasking operating systems have well-defined memory management. Due to this operating system does not allow any types of permissions for undesirable programs to waste memory.

* **Time Shareable**

  * All tasks are allotted a specified amount of time so that they do not have to wait for the CPU.



**Disadvantages:**


* **Processor Boundation**

  * The system may run programs slowly because of the poor speed of their processors, and their reaction time might rise when processing many programs. To solve this problem, more processing power is required.

* **Memory Boundation**

  * The computer's performance may get slow performance due to the multiple programs run at the same time because the main memory gets overloaded while loading multiple programs. Because the CPU is unable to provide different times for each program, reaction time increases. The primary cause of this issue is that it makes use of low-capacity RAM. As a result, the RAM capacity can be raised to provide a solution.

* **CPU Heat Up**

  * The multiple processors are busier at the same time to complete any task in a multitasking environment, so the CPU generates more heat.

---

### Multithreading:

**Definition:** A thread is a path which is followed during a program’s execution. Majority of programs written now a days run as a single thread.Lets say, for example a program is not capable of reading keystrokes while making drawings. These tasks cannot be executed by the program at the same time. This problem can be solved through multitasking so that two or more tasks can be executed simultaneously.

![image](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/multithreading_01.jpg)

**Multitasking is of two types:** 

* Processor based and thread based. Processor based multitasking is totally managed by the OS, however multitasking through multithreading can be controlled by the programmer to some extent.

* The concept of multi-threading needs proper understanding of these two terms – a process and a thread. A process is a program being executed. A process can be further divided into independent units known as threads.

* A thread is like a small light-weight process within a process. Or we can say a collection of threads is what is known as a process.




* Threading is used widely in almost every field. Most widely it is seen over the internet now days where we are using transaction processing of every type like recharges, online transfer, banking etc. Threading is a segment which divide the code into small parts that are of very light weight and has less burden on CPU memory so that it can be easily worked out and can achieve goal in desired field. The concept of threading is designed due to the problem of fast and regular changes in technology and less the work in different areas due to less application. Then as says “need is the generation of creation or innovation” hence by following this approach human mind develop the concept of thread to enhance the capability of programming.



---

### Monolithic architecture vs Microkernel architecture
In the monolithic approach the entire
operating system runs as a single program in kernel mode. The operating system is
written as a collection of procedures, linked together into a single large executable
binary program. When this technique is used, each procedure in the system is free
to call any other one, if the latter provides some useful computation that the former
needs. Being able to call any procedure you want is very efficient, but having thousands of procedures that can call each other 
without restriction may also lead to a system that is unwieldy and difficult to understand. 
Also, a crash in any of these procedures will take down the entire operating system.

The basic idea behind the microkernel design is to achieve high reliability by
splitting the operating system up into small, well-defined modules, only one of
which—the microkernel—runs in kernel mode and the rest run as relatively powerless ordinary user processes. 
In particular, by running each device driver and file system as a separate user process, 
a bug in one of these can crash that component,
but cannot crash the entire system. Thus a bug in the audio driver will cause the
sound to be garbled or stop, but will not crash the computer. In contrast, in a
monolithic system with all the drivers in the kernel, a buggy audio driver can easily
reference an invalid memory address and bring the system to a grinding halt instantly.

---

### Why Windows kernel is more monolithic & no microkernel?
Windows NT was never a pure microkernel, but it was microkernel-ish for a long time. 
NT 3.x had graphics drivers as a user process, and honestly NT 3.x was super stable. 
NT 4.0 moved graphics drivers into the kernel; it was less stable but much more performant. 
Windows kernel is basically monolithic, but drivers are still developed separately.

---

### What happens when we turn on our Computer?

---

Every PC contains a motherboard, on the motherboard is a program called the system BIOS (Basic Input Output System).
The BIOS contains low-level I/O software, including procedures to
read the keyboard, write to the screen, and do disk I/O, among other things. 
Nowadays, it is held in a flash RAM, which is nonvolatile but which can be updated by
the operating system when bugs are found in the BIOS.
When the computer is booted, the BIOS is started. It first checks to see how
much RAM is installed and whether the keyboard and other basic devices are installed and responding correctly. 
It starts out by scanning the PCIe and PCI buses to detect all the devices attached to them. 
If the devices present are different from
when the system was last booted, the new devices are configured.
The BIOS then determines the boot device by trying a list of devices stored in
the CMOS memory. The user can change this list by entering a BIOS configuration
program just after booting. Typically, an attempt is made to boot from a CD-ROM
(or sometimes USB) drive, if one is present. If that fails, the system boots from the
hard disk. The first sector from the boot device is read into memory and executed.
This sector contains a program that normally examines the partition table at the
end of the boot sector to determine which partition is active. Then a secondary boot
loader is read in from that partition. This loader reads in the operating system
from the active partition and starts it.
The operating system then queries the BIOS to get the configuration information. For each device, 
it checks to see if it has the device driver. If not, it asks the user to insert a CD-ROM containing the driver 
(supplied by the device’s manufacturer) or to download it from the Internet. 
Once it has all the device drivers, the operating system loads them into the kernel. 
Then it initializes its tables, creates whatever background processes are needed, and starts up a login program or GUI.

---

# Day 2 2/7

## Process Management

- Process is "Program in execution".
- It is a part of program which is under execution
- Program is passive entity

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/3_process.png)

- <u> **Stack** </u>

- The stack contains the temporary data such as methods/functions,parameters,return address and local variable.

- <u> **Data** </u>
- The section contains the global and static variables

- <u> **Text** </u>
- This includes the current activity represented by the value of program counter and contents of the processor's register.

- <u> **Heap** </u>
- This is dynamically allocated memory to process during its runtime this memory can be released once execution is completed.

---

### Different states of Process

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/4_process.png)

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/5_process.png)

---

### Process vs Program

---

### Types of Process

1. I/O Bound
2. CPU Bound

---

### Structure of PCB

---

### How does a Process look like in memory?

---

### Process Scheduling

#### <u>What is Scheduling?</u>

#### <u>Scheduling Queue</u>

- Job Queue
- Ready Queue
- Device Queue

#### <u>Schedulers in OS </u>

- Scheduler are special system software which handle process scheduling in various ways. Their main task is to select the jobs to be submitted into the system and to decide which process to run.

![os](https://github.com/shreeshailaya/c-dac/blob/main/Operating%20system/Media/6_schedulers.png)

Schedulers are of three types:-

- Long Term Schedular

- Short Term Schedular

- Medium Term Schedular

---

### CPU Bound Process vs I/O Bound Process

---

### What is Context Switch?

---

### IPC

---

### Define Pipe

---

### Maximum number of zombie process a system can handle?

---

---

# Day 3 3/7

## Thread Concepts

### What is Thread?

---

### Types of threads

---

### What is Multithreading?

#### <u> Benefits </u>

#### <u> Examples </u>

---

### Multithreading Models

- Many to One Model

- One to One Model

- Many to Many Model

### Process vs Threads

---

---

# Day 4 4/7

## Process Scheduling

### Why do we need it?

Process Scheduling is an OS task that schedules processes of different states like ready, waiting, and running. Process scheduling allows OS to allocate a time interval of CPU execution for each process. Another important reason for using a process scheduling system is that it keeps the CPU busy all the time. This allows you to get the minimum response time for programs.

---

### CPU Burst Cycle

---

### CPU Scheduler

#### <u>Preemptive Scheduling</u>

#### <u>Non-Preemptive Scheduling</u>

#### <u> Advantages/Disadvantages </u>

---

### Dispatcher

#### <u>Role of Dispatcher</u>

#### <u>Dispatch latency</u>

---

### Scheduling Criteria

#### <u> CPU utilisation </u>

#### <u>Throughput </u>

#### <u> TAT [Turn around time] </u>

#### <u> Waiting Time</u>

#### <u> Response Time </u>

---

### Scheduling Algorithms

- FCFS

- SJFS

- Priority-based

- Round-Robin

- MLQS

- MLFQS

#### <u> Which Algorithm is used in the real world OS scenario?</u>

---

### Starvation

#### <u> Defining Starvation</u>

#### <u>How to prevent Starvation?</u>

---

### Ageing

---

---

# Day 5 5/7

## Synchronisation

### Physical Address Space vs Logical Address Space

---

### Critical Section Problem

#### <u>Peterson Solution</u>

---

### Why Preemptive Kernel is better than Non-Preemptive Kernel?

---

### Semaphore

- Binary Semaphore

- Counting Semaphore

---

### Busy Waiting & Spin Lock

---

### Bounded Buffer

---

### Reader-Writer Problem

---

### Dining Philosopher Problem

---

---

# Day 6 6/7

## Deadlocks

### What is Deadlock?

---

### Effects of Deadlock

---

### Necessary Conditions:

#### <u> Mutual Exclusion</u>

#### <u> Hold & Wait</u>

#### <u> No Preemption </u>

#### <u> Circular Wait</u>

---

### Methods for Deadlock handling

#### <u>Prevention or avoidance</u>

#### <u> Detection or Recovery </u>

- Banker's Algorithm
- Ostrich Algorihtm
- Resource Preemption

---

---

# Day 7 7/7

## Memory Management

### Memory Allocation

---

#### Contiguous Memory Allocation</u>

##### <u>Address Translation</u>

##### <u> Fixed Partitioning</u>

##### <u>Variable Partitioning</u>

##### <u>Dynamic Storage Allocation Problem</u>

- Best Fit
- Worst Fit
- First Fit

##### <u>Internal Fragmentation</u>

##### <u>External Fragmentation</u>

---

### Paging

#### <u> Page Table </u>

#### <u> Page number </u>

#### <u> Page offset</u>

#### <u> Page table limit Register</u>

---

### Segmentation

#### <u> Segment Table</u>

#### <u> Base Register</u>

#### <u> Limit Register</u>

---

## Virtual Memory Management

### <u>How is it implemented?</u>

### <u>Advantages</u>

---

### Demand Paging

---

### Pure Demand Paging

---

### What is Page Fault?

---

### Page Replacement Algorithms

- FIFO

  - Belady's anomaly

- Optimal Page Replacement

- LRU

---

### What is Frame Rate?

---

### What is Thrashing?

---

## Storage Management

### <u>Secondary Storage Structure</u>

### <u>Disk Scheduling</u>

---

---
