config = {
    login(username, password)    //lay ra user pass va url API
    {
        var form = new FormData(); //tao form trong
        form.append("json",JSON.stringify({username: username, password: password})); //them json vào form
        return {url:'index.php/First_controller/accountController',data:form} //return 
    },
    dataUsers:  global.dataUsers, //du lieu user
    // buttonDrawNav: [
    //     {name: 'giấy nháp'},
    //     {name: 'chel long'},
    //     {name: 'lê hiếu'},
    //     {name: 'linh vũ'},
    // ]
    getNameUsers() {
        var name=[];
       for(i=0; i<global.dataUsers.length(); i++) {
            name.push(global.dataUsers[i].hoten);
       }
    }

}
export default config;