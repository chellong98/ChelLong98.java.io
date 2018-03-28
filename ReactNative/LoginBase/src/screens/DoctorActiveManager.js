import React, { Component } from 'react';
import {View, Text,StyleSheet,TouchableOpacity, Alert} from 'react-native';
import {PagerTabIndicator, IndicatorViewPager, PagerTitleIndicator, PagerDotIndicator} from 'rn-viewpager';
// import { Text,Container, Header,Thumbnail, Content, Card, CardItem,Item, Body,Input,Label, Left  } from 'native-base';
import {Container, Header,Body, Left,Right, Footer} from 'native-base';
import Icon from 'react-native-vector-icons/FontAwesome';


export default class DoctorActiveManager extends Component {
  render() {
    return (
      <Container style={styles.container}>
        <Header style={styles.header} backgroundColor='#00aa8d' androidStatusBarColor='#00aa8d'>
            <Body>
                <Text style={{fontSize: 20, justifyContent: 'center', color: 'white'}}><Icon name='bell' size={20} />  Lịch đặt khám</Text>
            </Body>
            <Right>
                <TouchableOpacity style={{width: 20}} onPress={()=>Alert.alert('popup menu')}>
                    <Icon 
                    name="ellipsis-v"
                    style={{color: 'white', justifyContent: 'center'}}  
                    size={20}  
                    />
                </TouchableOpacity>
            </Right>
        </Header>
       
        <IndicatorViewPager
			style={{flex:1, backgroundColor:'red'}}
            indicator={this._renderTitleIndicator()}
        >
    
            <View style={{backgroundColor:'cadetblue'}}>
                <Text>page one</Text>
            </View>
            <View style={{backgroundColor:'cornflowerblue'}}>
                <Text>page two</Text>
            </View>
            <View style={{backgroundColor:'#1AA094'}}>
                <Text>page three</Text>
            </View>
                    
        </IndicatorViewPager>
        
      </Container>
    )
  }

  _renderTitleIndicator() {
      return <PagerTitleIndicator selectedBorderStyle={{backgroundColor: 'white'}} selectedItemTextStyle={{padding: 20, backgroundColor: '#01A54E',color: 'white'}} itemStyle={{padding: 20, backgroundColor: '#01A54E', }}  itemTextStyle={{color: 'rgba(255,250,250,0.7)',}} titles={['one', 'KẾT THÚC', 'KHÁCH HỦY','BẠN HỦY', 'five', 'six', 'seven', 'eight', 'nine']}/>
  }
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    header: {

    },
    body: {
        flex: 1,
       
    }
});