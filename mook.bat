echo OFF
set NUM=0 1 2 3 4 5 6 7 8 9 A B C D E F

shutdown /r /t 02

:MOOK
Set /a num=(%Random% %%9)+1
Set /a num2=(%Random% %%9)+1
color %num%%num2%
echo YOU'VE BEEN MOOKED BY THE MOOKER!!! YOU MOOK!
goto MOOK