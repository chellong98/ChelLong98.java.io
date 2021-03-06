import React, { Component } from 'react';
import {View , Animated, Image, StyleSheet,TouchableOpacity, Text,Dimensions} from 'react-native';
import {Container, Card,List, CardItem, Item,Thumbnail, Button, ListItem, Input, Header, Body, Right, Title, Left,Icon, Content} from 'native-base';
import Setting from './../utils/setting';
export interface Props {
  navigation: any,
}
export default class infodetailuser extends Component {
  render() {
    const {params} = this.props.navigation.state;
    var user = params.user;

    return (
      <Container>
        <Header searchBar rounded style={{}} backgroundColor='#00903b' androidStatusBarColor='#00903b'>
          <Item style={{flex: 8/10}}>
            <Icon name='ios-search'/>
            <Input placeholder='Search' />
            <Icon name='ios-people'/>
          </Item>
          <Right style={{flex: 2/10}}>
          <Button transparent >
            <Icon android='md-add' ios='md-add'/>
          </Button>
          </Right>
        </Header>
        <Content>
          <Card style={{flex: 0}}>
            <CardItem>
              <Left>
                <Thumbnail source={{uri: Setting.SERVER_API+user.image}} />
                <Body>
                  <Text style={{color: '#00903b'}}>{user.hoten}</Text>
                  <Text note>{user.ngaysinh}</Text>
                </Body>
              </Left>
            </CardItem>
            <CardItem style={{borderWidth: 1, borderRadius: 10, }}>
            
                <Input
                multiline={true}
                numberOfLines={4}
                placeholder='Bạn đang nghĩ gì?'
                label='new'
                
                // onChangeText={(text) => this.setState({text})}
                // value={this.state.text}/>
                />
    
            </CardItem>
            <CardItem>
              <Body>
                <Image  style={{height: 200, width: 200, flex: 1}}/>
               <Item style={{flex: 1}}>
                  <Left>
                    <Text style={{flex: 2/10}}>email</Text>
                  </Left>
                  <Right style={{flex : 8/10}}>
                    <Text>{user.email}</Text>
                  </Right>
               </Item>
              </Body>
            </CardItem>
            <CardItem>
              <Left>
                <Button transparent textStyle={{color: '#87838B'}}>
                  <Icon style={{color: '#00903b'}} name="logo-github" />
                  <Text>1,926 stars</Text>
                </Button>
              </Left>
            </CardItem>
          </Card>
        </Content>
      </Container>
    )
  }
};
