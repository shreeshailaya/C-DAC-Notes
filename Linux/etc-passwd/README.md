# /etc/passwd file
```bash
sabyasachi@h0tPlug1n:~$ cat /etc/passwd 

root:x:0:0:root:/root:/bin/bash 
daemon:x:1:1:daemon:/usr/sbin:/usr/sbin/nologin 
bin:x:2:2:bin:/bin:/usr/sbin/nologin 
sys:x:3:3:sys:/dev:/usr/sbin/nologin 
sync:x:4:65534:sync:/bin:/bin/sync 
games:x:5:60:games:/usr/games:/usr/sbin/nologin 
man:x:6:12:man:/var/cache/man:/usr/sbin/nologin 
... 
sabyasachi:x:1000:1000:Sabyasachi Paul,,,:/home/sabyasachi:/bin/bash 
sssd:x:127:137:SSSD system user,,,:/var/lib/sss:/usr/sbin/nologin 

This file has user account information. It is divided into 7 sections 
In order, these fields are: 

```
- The username (root)
- The user's password hash. In most cases the hash will not actually be given here and instead will be replaced with an `x`. This means that the hash can instead be found in `/etc/shadow`.
- The user's UID (User ID) — as the root user, this is 0.
- The user's GID (Group ID). For the root user this will also be 0.
- A description of the account. This is simply "root" in the example, however, it can be left blank.
- The user's home directory (/root)
- The user's login shell (/bin/bash)

e.g.: `user1`:`$1$123$LZ9RzzZZaryI4vY3ZLGhN0`:`0`:`0`:`iamroot`:`/root`:`/bin/bash`

*If we can manually form our own entry (including a full password hash) and insert it into the passwd file then we can create a new user account. Interestingly, Linux doesn't check to confirm that the UID and GID of an account are unique — only that usernames are unique. In other words, we can create an account with our own unique username that has a UID and GID of 0, effectively giving our new account the same permissions as the root account!*
