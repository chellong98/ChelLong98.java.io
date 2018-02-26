import React , {Component} from 'react'
import {
    View,
    Text,
    StyleSheet,
    ListView,
    TouchableOpacity
}from 'react-native'

// var URL_API='http://10.0.3.2:8080/Json/JsonServlet'
class QuestionAndAnswer extends Component {
    constructor(props) {
        super(props);
        var ds = new ListView.DataSource({rowHasChanged: (r1, r2)=>r1!==r2});
        this.state= {
            dataSource : ds
        }
    }
   
    fetchData() {
        fetch(URL_API, {method:"POST", body:null})
        .then((response) => response.json()) //lấy về dữ liệu là 1 dạng Json
        .then((responseData) => {
            this.setState({
                dataSource: this.state.dataSource.cloneWithRows(responseData)
            })
        })
        .done()
    }

    componentDidMount(){
        // this.fetchData();
        alert("hello");
    }

    taoHang(property){
        return(
            <TouchableOpacity style={styles.row}>
                <View style={styles.title}>
                    <Text style={styles.rowTitle}>
                        {property.categoryName}
                    </Text>
                </View>
            </TouchableOpacity>
        )
    }

    render() {
        return (
            <View style={styles.container}>
                <View style={styles.header} /*header*/> 
                    <View style={styles.baoTitle}>
                        <Text style={styles.titleHeader}>
                            Hỏi Đáp
                        </Text>
                    </View>
                </View>
                <View style={styles.list}/*danh sach hỏi đáp*/>
                    <ListView
                        dataSource={this.state.dataSource}
                        renderRow={this.taoHang.bind(this)}
                    />
                </View>
            </View>
        );
    }
}

var styles = StyleSheet.create({
    container: {
        flex: 1,
    },
    header: {
        flexDirection: 'row',
        flex: 1,
        backgroundColor: '#910B7B',
        justifyContent: 'center',
    },
    baoTitle: {
        justifyContent: 'center',
        alignItems: 'center',
        
    },
    titleHeader: {
        fontSize: 20,
        fontWeight: '400',
        color: 'white',
    },
    list: {
        flex: 10,
        backgroundColor:'#DE64CA',
    },
    row: {
        flexDirection: 'row',
        flex: 1,
        padding: 10,
        borderBottomWidth: 1,
        borderColor: 'red',
    },
    rowTitle: {
        flex: 1,
        justifyContent: 'center',
        alignItems: 'center',
    },
    title: {
        fontSize: 20,
        fontWeight: '300',
        color: 'white',
    }
})

module.exports = QuestionAndAnswer;