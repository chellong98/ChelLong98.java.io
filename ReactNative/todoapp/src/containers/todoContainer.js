import React, { Component } from 'react';
import Todos from './../screens/todosscreen';
import Setting from './../utils/setting';
import {Container,Right, Header, Body, Left, Title,Content, Separator, ListItem, Thumbnail,List } from 'native-base';
import {View, Text, TouchableOpacity, StyleSheet,Alert,RefreshControl } from 'react-native';
var ListDone = Setting.ListTodo;
export interface Props {
  navigation: any,
}
export interface State {}

export default class todoContainer extends Component<Props,State> {
  constructor (props) {
    super(props);
    this.state = {
      data : ListDone
    }
  }

  renderItem(type,item,row)
  {
  console.log("rơ: "+row)
  if(item.status!=type) return 
    if (type==1)
    {
      return ( 
        <ListItem key = {row} style={styles.listItem}>
        <Left>
          <TouchableOpacity onPress = {()=>this.changeStatus(row,item)}>
            <Thumbnail source={require('./../../images/checked.png')} />
          </TouchableOpacity>
        </Left>
        <Body style={styles.bodyItem}>
          <Title style={{color: '#45637C'}}>
            {item.name}
          </Title>
          <View style={{borderBottomWidth: 1, borderBottomColor: '#45637C', position: 'relative', bottom: 10, width: '100%'}}></View>
        </Body>
      </ListItem>)
    }
    else if (type==0)
    {
      return ( 
        <ListItem key = {row} style={styles.listItem}>
        <Left>
          <TouchableOpacity onPress = {()=>this.changeStatus(row,item)}>
            <Thumbnail source={require('./../../images/notcheck.png')} />
          </TouchableOpacity>
        </Left>
        <Body style={styles.bodyItem}>
        <Title style={{color: '#45637C'}}>{item.name}</Title>
        </Body>
        <Right>
          <Text style={{color: '#45637C'}}>{item.time}</Text>
        </Right>
      </ListItem>)
    }
  }

  changeStatus(index,item)
  {
  
    item.status = 1-item.status; //thay doi status
  
    this.state.data[index].status =   item.status //thay doi gia tri status cua phan tu trong mang
  
    data = this.state.data; //sets stae
  
  this.forceUpdate();
  
  console.log("click")
  
  }
 
  render() {
    const {params} = this.props.navigation.state;
    if(params==undefined) {
      console.log('yes');
    }else{
      var item = params.item;
      console.log(item);
      if(ListDone.indexOf(item)==-1) {
        ListDone.push(item);
      }
      console.log(ListDone.length);
    }
    return (
        <Todos 
         data = {this.state.data}
         renderItem = {(type, item, row)=>this.renderItem(type, item, row)}
         navigation={this.props.navigation}
         />
    )
  }
};

const styles = StyleSheet.create({
  listItem: {
    backgroundColor: '#FFFFFF',
    borderBottomWidth: 1,
  },
  bodyItem: {
    position: 'absolute', 
    left: 80
  }
});