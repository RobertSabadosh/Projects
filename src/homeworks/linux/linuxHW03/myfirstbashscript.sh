#!/bin/bash
date
sleep 1
echo 'Hello Robert!'
sleep 1
pwd
sleep 1
ps -ef | tail +2 | wc -l
sleep 1
ps -ef | grep bioset | grep -v 'grep bioset' | wc -l
sleep 1
ls -la /etc/passwd | awk '{print $1}'
