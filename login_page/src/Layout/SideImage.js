import man from '../image/man.png';
import background from "../image/background.png";

function SideImage(){

    return(
        <div className='sideImage'>
              <p style={{color:'white'}}>Lorem ipsum dolor sit amet</p>
              <img className="man" src={man} alt="PersonImage" width="380" height={470}/>
              <img className='background' src={background} alt="backgroundImage" width="350" height={400}/>
          </div>
    );
}
export default SideImage;