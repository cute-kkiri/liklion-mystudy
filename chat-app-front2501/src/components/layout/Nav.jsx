import { Link } from 'react-router-dom'

function Nav() {
    return (
        <nav className="bg-white shadow-sm w-full">
            <div className="max-w-7xl mx-auto flex justify-between items-center px-6 py-4">
                <div className="flex items-center space-x-4">
                    <Link to="/" className="flex items-center space-x-3">
                        <div className="w-10 h-10 relative">
                            <div className="absolute inset-0 bg-purple-700 rounded-r-full"></div>
                            <div className="absolute top-0 left-0 w-5 h-full bg-purple-700"></div>
                            <div className="absolute top-0 left-0 w-2 h-full bg-blue-500"></div>
                        </div>
                        <span className="text-blue-900 font-bold text-xl">DATA BLOCKS</span>
                    </Link>
                </div>
                <div className="flex items-center space-x-4">
                    <Link to="/">
                        <button className="bg-gray-800 text-white px-4 py-2 rounded">채팅방 목록</button>
                    </Link>
                    <Link to="/chat/ai">
                        <button className="bg-gray-800 text-white px-4 py-2 rounded">AI 챗봇</button>
                    </Link>
                </div>
            </div>
        </nav>
    )
}

export default Nav
