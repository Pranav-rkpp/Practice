import username from "./image/UsernameIcon.png"
import password from "./image/LockedPasswordIcon.png"
import "./css/App.css";
import hideIcon from "./image/HideIcon.png"
import { Link } from 'react-router-dom';
import SideImage from './Layout/SideImage';

function LoginPage() {
  return (
    <>
      <h2 className="welcomeText">Welcome back</h2>
      <div className="main">
          <SideImage/>
          <div className='content'>
                    <p style={{color:'blue',fontSize: '24px'}}>Please login to manage and control applications</p>
                    <form>
                      <div className='username'>
                      <input type='text' placeholder='Username'/>
                      <img src={username} alt='username'></img>
                      </div>
                      <div className='password'>
                      <input type='password' width={500} placeholder='Password'/>
                      <img src={password} alt='password'></img>
                      <img src={hideIcon} alt='hideIcon' style={{position:'absolute',left:'87.5%', width:'20px', height:'15px'}}></img>
                      </div>
                      <button type='submit'>Sign in</button>
                    </form>
                    <p><Link to='/ForgetPasswordPage'>Forget Password?</Link></p> 
           </div>
       </div>
    </>
  );
}

export default LoginPage;