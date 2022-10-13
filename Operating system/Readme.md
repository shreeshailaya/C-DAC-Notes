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

---

### MultiTasking

---

### Multithreading

---

### Monolithic architecture vs Microkernel architecture

---

### Why Windows kernel is more monolithic & no microkernel?

---

### What happens when we turn on our Computer?

---

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
