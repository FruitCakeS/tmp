#!/bin/sh

for i in $( ls data/$1/*.in); do
	python3 "$1.py" < "$i" >  "${i%.in}.test"
	cmp --silent "${i%.in}.test" "${i%.in}.out"|| echo "case $i failed"
done