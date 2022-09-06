function powerSet(s:string , i : number , cur :string)  : void{
    if (s.length == i){
        console.log(cur)
        return;
    }

    powerSet(s , i+1 , cur + s[i])
    // so this second call is for the second arrow in the tree
    // this will print the same current char that we already treated
    powerSet(s , i+1 , cur)

}