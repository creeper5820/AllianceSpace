git checkout Back-end-Project;

git add .;

if [ $1 ]
then
	git commit -m "$1";
else
	git commit -m "默认PUSH";
fi

echo "message: $1";

git push origin Back-end-Project;
