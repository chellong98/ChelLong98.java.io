import React, { Component } from 'react';
import {View, Text, ImageBackground,TextInput, TouchableOpacity} from 'react-native';
import {Item,Input,Icon,Button,Left, Right,Content} from 'native-base';
import ButtonLoading from 'rn-gn-buttonloading';

srcimage = require('./../images/login.jpg');
export interface Props {
  navigation: any,
}
export default class loginscreen extends Component<Props> {
  render() {
    return ( 
      <ImageBackground
        source = {srcimage}
        style={{flex: 1, width: '100%', justifyContent: 'center', alignItems: 'center'}}
      >
        <View style={{width: '100%', alignItems: 'center', paddingHorizontal: 20,  backgroundColor: null, marginTop: 200}}>
          <View >
            <Text style={{color: '#67DAF9', fontSize: 20}}>REACT NATIVE</Text>
          </View>
          <View style={{width: '100%',marginTop: 10,}}>
              <Item rounded style={{backgroundColor: 'rgba(255,255,255,0.6)', marginTop: 20}}>
                <Icon android='md-contact' ios='md-contact' style={{color: 'white'}}/>
                <Input 
                  placeholder='Rounded Textbox'
                  placeholderTextColor= 'white'
                  selectionColor = 'white'
                  returnKeyLabel = "next"
                  style={{color: 'white'}}
                  />
              </Item>
              <Item rounded style={{backgroundColor: 'rgba(255,255,255,0.6)', marginTop: 20}}>
                <Icon android='md-lock' ios='md-lock' style={{color: 'white'}}/>
                <Input 
                  placeholder='Password'
                  placeholderTextColor= 'white'
                  secureTextEntry
                  style={{color: 'white'}}
                  />
              </Item>
              <Item style={{borderBottomWidth: 0, marginTop: 20}}>
                <ButtonLoading
                  loadingColor= {'white'}
                  background = {{backgroundColor: '#67DAF9'}}
                  textstyle = {{color: 'white'}}
                  title = 'LOGIN'
                  size = {40}
                  onPress = {()=>{
                    setTimeout(()=>{this.button.cancel()},5000);
                  }}

                  ref = {(btn)=>{
                    this.button = btn;
                  }}
                />
              </Item>
              <Item style={{ marginTop: 20, borderBottomWidth: 0}}>
                <Left>
                  <TouchableOpacity style={{borderBottomWidth: 1, borderLeftWidth: 1, borderColor: 'white'}}>
                    <Text style={{color: 'white', padding: 5}}>Create Account</Text>
                  </TouchableOpacity>
                </Left>
                <Right>
                  <TouchableOpacity style={{ borderBottomWidth: 1, borderRightWidth: 1, borderColor: 'white'}}>
                    <Text style={{color: 'white', padding: 5}}>Forgot Password?</Text>
                  </TouchableOpacity>
                </Right>
              </Item>
          </View>
        </View>
        
      </ImageBackground>
    )
  }
};
