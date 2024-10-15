## SUIDs, SGIDs, and Sticky Bits

In Linux, file permissions are given in 3 categories: owner, group, and other users. And on top of that, special permissions like SUID, SGID, and Sticky Bits are given to those categories respectively. 

**SUID** -> `Set User ID` -> Helps running a program as another user than the one executing it 
**SGID** -> `Set Group ID` -> Helps running a program as another group permission than the one the user executing it is a part of. 
**Sticky Bits** -> Used to set delete permissions over a directory. Only file owner, directory owner or root can delete it. 

For setting SUID, SGID, and Sticky bits, there are numeric notations: 

SUID -> 4 -> u+s 
SGID -> 2 -> g+s 
Sticky bit -> 1 -> o+t 

- SUID is set on owner. It can't be set on other 2 categories. 
- SGID is set on group. It can't be set on other 2 categories. 
- Sticky is set on others. It can't be set on other 2 categories. 

chmod 4222 filename 
4 -> SUID
222 -> Respective file permissions for the 3 categories. 

## Using with chmod
chmod u+s filename  -> Used to set SUID over a binary file 
chmod g+s filename  -> Used to set SGID over a binary file 
chmod o+t filename  -> Used to set sticky bits over a directory 

-rwsr--r-- : s bit is for SUID set bit + having executable file permission (x). 
-rwSr--r-- : S bit is for SUID set bit and no executable file permission. 
-rw-r-sr-- : s bit is for SGID set bit + having executable file permission (x). 
-rw-r-Sr-- : S bit is for SGID set bit and no executable file permission. 
-rw-r--r-T : T bit is for Sticky bit 
