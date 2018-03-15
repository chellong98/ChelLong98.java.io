import React, { Component } from 'react';
import Login from './../screens/Login';
import {
    Alert,
} from 'react-native';
export interface Props {
    navigation: any,

}
export interface State {}

export default class LoginContainer extends Component<Props, State> {
    login(username, password) {
        // Alert.alert(username + ' | ' + password)
        if(username==='admin' && password==='123') {
            this.props.navigation.navigate('HomeContainer');
        } else {
            Alert.alert('username or password is incorrect');
        }
    }  
  render() {
    return (
      <Login navigation={this.props.navigation} login={(username, password)=>this.login(username, password)}/>
    )
  }
};
