import React, { Component } from 'react';
import DrawNavScreen from './../screens/DrawNavscreen';
import Pakage from './../utils/pakage';
import UserService from './../services/UserServices';
export interface Props {
  navigation: any,
}

export default class customdraw extends Component<Props> {
  
  getUsers() { 
    // console.log("listUsers: ");
    // console.log(global.listUsers);
    return global.listUsers;
  }
  render() {
    const account = global.account;
  
    return (
      
      <DrawNavScreen navigation={this.props.navigation} account={account} getUsers = {()=>this.getUsers()}/>
      // <DrawNavScreen navigation={this.props.navigation}/>
    )
  }
};
