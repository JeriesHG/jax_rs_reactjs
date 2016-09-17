import React, { Component } from 'react';
import MaterialButton from './MaterialButton';

const App = React.createClass({
	getInitialState() {
		return { num  : Math.ceil(Math.random() * 6) ,
				 message : 'Jupiter'};
	},
	getNumeroAleatorio() {
		this.setState({num:Math.ceil(Math.random() * 6)});
	},
	update:function(){
    	this.setState({message:'Saturno'});
  	},
	
	render() {
		return (
			<section>
				<h2>React Example</h2>
			    <p>Numero aleatorio : {this.state.num}</p>
			    
			    <MaterialButton onClick={this.getNumeroAleatorio}>
			    	LANZAR
			    </MaterialButton>	
			    <br/>

	
				<p>My Component : {this.state.message}</p>
			    <MaterialButton onClick= {this.update}>
                    CLICK ME
			    </MaterialButton>		

			</section>

		);
}
});

export default App;



