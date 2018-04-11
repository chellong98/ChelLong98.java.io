import React, { Component } from 'react';
import {View , Image, StyleSheet,TouchableOpacity, Text,Dimensions} from 'react-native';
import {Container, Card,List, CardItem, Item,Thumbnail, Button, ListItem, Header, Body, Right, Title, Left,Icon, Content} from 'native-base';
const {width, height} = Dimensions.get('window');
export default class listuser extends Component {
    constructor(props) {
        super(props);
        this.state = {
            list: [
                {name: 'giaynhap', thumbnail: '/uploadImages/giaynhap.jpg', image: './../ACT.jpg', ngaysinh: '1998-02-13', linkfacebook: 'https://www.facebook.com/GiayNhapcoder', gioitinh: 'Male', email: 'giaynhapcoder@gmail.com', password: 'cuccut123'},
                {name: 'chellong', thumbnail: '/uploadImages/chellong.jpg', image: './../ACT.jpg', ngaysinh: '1998-02-13', linkfacebook: 'https://www.facebook.com/GiayNhapcoder', gioitinh: 'Male', email: 'giaynhapcoder@gmail.com', password: 'cuccut123'},
                {name: 'lehieu', thumbnail: '/uploadImages/sucvathieu.jpg', image: './../ACT.jpg', ngaysinh: '1998-02-13', linkfacebook: 'https://www.facebook.com/GiayNhapcoder', gioitinh: 'Male', email: 'giaynhapcoder@gmail.com', password: 'cuccut123'}
            ],
            statusLike: false,
            statusComment: false,

        };
       
    }
    componentWillMount() {
        for(i=0; i<this.state.list.length; i++) {
            this.state.list[i].statusLike = false //them 1 thuoc tinh vao doi tuong trong mang
            this.state.list[i].statusComent = false 
        }
        this.forceUpdate()
        console.log(this.state.list)
    }
    taoHang(item, index) {
        console.log("yes");
        var sourceImg = "'"+item.thumbnail+"'";
        
        var likeColor =item.statusLike==true ? '#00903b' : undefined
        var commentColor=item.statusComment==true ? '#00903b' : undefined
        return (
            <ListItem style={{borderBottomWidth: 0}}>
            <Card>
                <CardItem style={{}}>
                    <Left>                       
                        <Thumbnail source={{uri: 'http://192.168.1.98:8080/adminDashboard'+item.thumbnail}}/>
                        <Body>
                            <Text style={{fontSize: 20,color: '#00903b', fontWeight: '100'}}>{item.name}</Text>
                            <Text style={{fontStyle: 'italic'}}>10/04/2018 - <Icon android='md-globe' ios='md-globe' style={{fontSize: 15, color: '#00903b'}}/></Text>
                        </Body>
                    </Left>
                    <Right>
                        <Icon android='md-more' ios='md-more'/>
                    </Right>
                </CardItem>
                <CardItem>
                    <Body> 
                        <Image source={require('./../images/ACT.jpg')} style={{width: width*(9/10), height: height*(2/10), marginRight: 20}}/>
                        
                    </Body>
                </CardItem>
                <CardItem >
                    <Left>
                        <Button 
                        transparent
                        onPress={()=>{
                            this.state.list[index].statusLike=!this.state.list[index].statusLike; 
                            this.forceUpdate(); 
                            console.log(this.state.statusLike)
                            }
                        }
                        >
                            <Text style={{color: likeColor}}><Icon active name="thumbs-up" style={{color: likeColor}}/> Likes</Text>
                        </Button>
                    </Left>
                    <Body>
                        <Button transparent onPress={()=>{
                            this.state.list[index].statusComment=!this.state.list[index].statusComment; 
                            this.forceUpdate(); 
                            console.log(this.state.statusComment)
                        }}>
                        
                        <Text style={{color: commentColor}}><Icon active name="chatbubbles" style={{color: commentColor}}/> Comments</Text>
                        </Button>
                    </Body>
                    <Right>
                        <Text><Icon name='md-time'/> 11h ago</Text>
                    </Right>
                </CardItem>
            </Card>
            </ListItem>
        )
    }
  render() {
    var listItem = this.state.list;
    
    return (
        <Container style={{flex: 1}}>
            <Header 
            style={{}} 
            backgroundColor='#00903b' 
            androidStatusBarColor='#00903b'>
                <Body >
                    <TouchableOpacity>
                        <Icon android='md-arrow-back' ios='md-arrow-back' style={{color: 'white'}}/>
                    </TouchableOpacity>
                </Body>
                <Left>
                    <Title>New Feed</Title>
                </Left>
                <Right>
                    <TouchableOpacity>
                        <Icon android='md-search' ios='md-search' style={{color: 'white'}}/>
                    </TouchableOpacity>
                </Right>
            </Header>
            <Content style={{flex: 1}}>
                <List
                  style={{}}
                >
                {
                    this.state.list.map((value, index)=>{
                        // value.statusLike = true;
                       return this.taoHang(value, index)
                    }) 
                }
                </List>
            </Content>
        </Container>
    )
  }
};

const styles = StyleSheet.create({
    Item: {
        borderBottomWidth: 0,
         flex: 1
    },
    leftItem: {
        flex: 3/10,
    },
    textLeft: {
        fontWeight: '100', 
        color: '#00903b'    
    }
});